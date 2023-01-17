package atividadePoo1Dia2;

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(01,"Bruno Primeiro", 99887755,223456789);
        pf.visualizar();

        PessoaJuridica pj = new PessoaJuridica(03,"EMP 1 teste",88775544,55555888, "Venda");
        pj.visualizar();
    }
}

package atividadePoo1Dia2;

public class Cliente {

    private int codCli=0;
    private String nomeCli;
    private int telCli=0;

    public Cliente(int codCli, String nomeCli, int telCli){
        this.codCli = codCli;
        this.nomeCli = nomeCli;
        this.telCli = telCli;

    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public int getTelCli() {
        return telCli;
    }

    public void setTelCli(int telCli) {
        this.telCli = telCli;
    }

    public void visualizar(){
        System.out.println("Código do cliente é: "+this.codCli);
        System.out.println("Nome do cliente: " +this.nomeCli);
        System.out.println("Tel do cliente: "+this.telCli);
    }

}
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
package atividadePoo1Dia2;

public class PessoaJuridica extends Cliente {
    private int cnpj;
    private String ramo;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public PessoaJuridica(int codCli, String nomeCli, int telCli, int cnpj, String ramo) {
        super(codCli, nomeCli, telCli);
        this.cnpj = cnpj;
        this.ramo = ramo;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("O CNPJ do cliente é: "+this.cnpj);
        System.out.println("O RAMO do cliente é: "+this.ramo);
    }

}
