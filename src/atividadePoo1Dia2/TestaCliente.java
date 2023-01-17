package atividadePoo1Dia2;

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(01,"Bruno Primeiro", 99887755,223456789);
        pf.visualizar();

        PessoaJuridica pj = new PessoaJuridica(03,"EMP 1 teste",88775544,55555888, "Venda");
        pj.visualizar();
    }
}
