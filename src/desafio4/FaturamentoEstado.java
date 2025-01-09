package desafio4;

public class FaturamentoEstado {
    private String estado;
    private double valor;

    public FaturamentoEstado(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
