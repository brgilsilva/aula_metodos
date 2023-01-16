package atividadePoo2;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario(01,"Bruno Gilberto",999554455,"Desenvolvedor Senior", 25000);

        System.out.println("Melhor funcionário da empresa é: "+func1.getNomeFunc());
        System.out.println("O salário dele é: " + func1.getSalarioFunc());

    }
}
