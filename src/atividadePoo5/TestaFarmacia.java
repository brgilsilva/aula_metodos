package atividadePoo5;

public class TestaFarmacia {
    public static void main(String[] args) {
        Farmacia remedio = new Farmacia(23,"Antibiótico",14,32,"Sim");

        System.out.println("O medicamento escolhido foi o "+remedio.getRemedio()+" no valor de R$"+remedio.getValor()+ " cada.");
        System.out.println("É necessario receita para este medicamento? "+remedio.getReceita());


    }
}
