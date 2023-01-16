package atividadePoo3;

public class Produto {
    private int cod;
    private String vedeoGame;
    private String acessorio;
    private String jogos;
    private float preco;

    public Produto(int cod, String vedeoGame, String acessorio, String jogos, float preco) {
        this.cod = cod;
        this.vedeoGame = vedeoGame;
        this.acessorio = acessorio;
        this.jogos = jogos;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getVedeoGame() {
        return vedeoGame;
    }

    public void setVedeoGame(String vedeoGame) {
        this.vedeoGame = vedeoGame;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
