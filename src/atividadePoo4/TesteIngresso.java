package atividadePoo4;

public class TesteIngresso {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso("Senhor dos Anéis","4h20","14h",15,2);

        System.out.println("O filme "+ingresso.getFilme()+" começará as "+ingresso.getHorario()+" na sala "+ingresso.getSala());


    }
}
