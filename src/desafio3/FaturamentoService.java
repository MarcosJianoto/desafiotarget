package desafio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FaturamentoService {

	public FaturamentoResumo processarFaturamento(String filePath) {
		List<FaturamentoDiario> faturamentos = carregarFaturamento(filePath);
		List<FaturamentoDiario> diasValidos = faturamentos.stream().filter(d -> d.getValor() > 0)
				.collect(Collectors.toList());

		double menorFaturamento = diasValidos.stream().mapToDouble(FaturamentoDiario::getValor).min().orElse(0);

		double maiorFaturamento = diasValidos.stream().mapToDouble(FaturamentoDiario::getValor).max().orElse(0);

		double mediaMensal = diasValidos.stream().mapToDouble(FaturamentoDiario::getValor).average().orElse(0);

		long diasAcimaDaMedia = diasValidos.stream().filter(d -> d.getValor() > mediaMensal).count();

		return new FaturamentoResumo(menorFaturamento, maiorFaturamento, diasAcimaDaMedia);
	}

	private List<FaturamentoDiario> carregarFaturamento(String filePath) {
		List<FaturamentoDiario> faturamentos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			StringBuilder jsonContent = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				jsonContent.append(line.trim());
			}

			String json = jsonContent.toString().replace("[", "").replace("]", "");

			String[] entries = json.split("},\\{");

			for (String entry : entries) {
				String cleanEntry = entry.replace("{", "").replace("}", "");
				String[] fields = cleanEntry.split(",");

				int dia = 0;
				double valor = 0;

				for (String field : fields) {
					String[] keyValue = field.split(":");
					String key = keyValue[0].replace("\"", "").trim();
					String value = keyValue[1].trim();

					if (key.equals("dia")) {
						dia = Integer.parseInt(value);
					} else if (key.equals("valor")) {
						valor = Double.parseDouble(value);
					}
				}

				faturamentos.add(new FaturamentoDiario(dia, valor));
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao carregar arquivo JSON: " + e.getMessage(), e);
		}

		return faturamentos;
	}
}
