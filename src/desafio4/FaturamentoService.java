package desafio4;

import java.util.ArrayList;
import java.util.List;

public class FaturamentoService {

	public List<FaturamentoEstado> calcularPercentualFaturamento(List<FaturamentoEstado> faturamentos) {
		double faturamentoTotal = faturamentos.stream().mapToDouble(FaturamentoEstado::getValor).sum();

		List<FaturamentoEstado> percentualFaturamento = new ArrayList<>();

		for (FaturamentoEstado faturamento : faturamentos) {
			double percentual = (faturamento.getValor() / faturamentoTotal) * 100;
			percentualFaturamento.add(new FaturamentoEstado(faturamento.getEstado(), percentual));
		}

		return percentualFaturamento;
	}
}
