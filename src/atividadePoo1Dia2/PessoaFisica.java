package atividadePoo1Dia2;

public class PessoaFisica extends Cliente{

    private int cpfCli;

    public PessoaFisica(int codCli, String nomeCli, int telCli, int cpfCli) {
        super(codCli,nomeCli,telCli);
        this.cpfCli = cpfCli;
    }

    public float getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(int cpfCli) {
        this.cpfCli = cpfCli;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("O CPF do cliente é: "+this.cpfCli);
    }
}
