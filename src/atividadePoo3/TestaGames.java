package atividadePoo3;

public class TestaGames {
    public static void main(String[] args) {

        Produto venda1 = new Produto(03,"Playstation4","2 Controles","Sem jogos",4500);

        System.out.println("O produto escolhido foi: "+venda1.getVedeoGame());
        System.out.println("O preço final é de: "+venda1.getPreco());

    }
}
