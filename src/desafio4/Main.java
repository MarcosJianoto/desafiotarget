package desafio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FaturamentoEstado> faturamentos = List.of(
                new FaturamentoEstado("SP", 67836.43),
                new FaturamentoEstado("RJ", 36678.66),
                new FaturamentoEstado("MG", 29229.88),
                new FaturamentoEstado("ES", 27165.48),
                new FaturamentoEstado("Outros", 19849.53)
        );

        FaturamentoService service = new FaturamentoService();
        List<FaturamentoEstado> resultado = service.calcularPercentualFaturamento(faturamentos);

        for (FaturamentoEstado faturamento : resultado) {
            System.out.printf("%s: %.2f%%%n", faturamento.getEstado(), faturamento.getValor());
        }
    }
}
