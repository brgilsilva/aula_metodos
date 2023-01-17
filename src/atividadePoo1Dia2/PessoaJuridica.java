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
