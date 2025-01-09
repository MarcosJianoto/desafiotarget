package desafio3;

public class FaturamentoResumo {
	private double menorFaturamento;
	private double maiorFaturamento;
	private long diasAcimaDaMedia;

	public FaturamentoResumo(double menorFaturamento, double maiorFaturamento, long diasAcimaDaMedia) {
		this.menorFaturamento = menorFaturamento;
		this.maiorFaturamento = maiorFaturamento;
		this.diasAcimaDaMedia = diasAcimaDaMedia;
	}

	public double getMenorFaturamento() {
		return menorFaturamento;
	}

	public double getMaiorFaturamento() {
		return maiorFaturamento;
	}

	public long getDiasAcimaDaMedia() {
		return diasAcimaDaMedia;
	}
}
