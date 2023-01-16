package atividadePoo4;

public class Ingresso {

    private String filme;
    private String duracao;
    private String horario;
    private float valor;
    private int sala;

    public Ingresso(String filme, String duracao, String horario, float valor, int sala) {
        this.filme = filme;
        this.duracao = duracao;
        this.horario = horario;
        this.valor = valor;
        this.sala = sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}

