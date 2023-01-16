package atividadePoo5;

public class Farmacia {
    private int cod;
    private String remedio;
    private int quantidade;
    private float valor;
    private String receita;

    public Farmacia(int cod, String remedio, int quantidade, float valor, String receita) {
        this.cod = cod;
        this.remedio = remedio;
        this.quantidade = quantidade;
        this.valor = valor;
        this.receita = receita;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
}
