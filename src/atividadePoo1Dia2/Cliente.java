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
