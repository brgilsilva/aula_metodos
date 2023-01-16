package atividadePoo6;

public class Curso {
    private int cod;
    private String nome;
    private int duracao;
    private float valor;
    private String modalidade;

    public Curso(int cod, String nome, int duracao, float valor, String modalidade) {
        this.cod = cod;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}


