package atividadePoo1;

public class Cliente {

    private int codCli=0;
    private float cpfCli;
    private String nomeCli;
    private int telCli=0;
    private String sexoCli;



    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public float getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(float cpfCli) {
        this.cpfCli = cpfCli;
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

    public String getSexoCli() {
        return sexoCli;
    }

    public void setSexoCli(String sexoCli) {
        this.sexoCli = sexoCli;
    }


    public Cliente(int codCli, float cpfCli, String nomeCli, int telCli, String sexoCli) {
        this.codCli = codCli;
        this.cpfCli = cpfCli;
        this.nomeCli = nomeCli;
        this.telCli = telCli;
        this.sexoCli = sexoCli;
    }

    public void visualizar(){
        System.out.println("Nome do cliente: " +nomeCli);
        System.out.println("Tel do cliente: "+telCli);
    }

}
