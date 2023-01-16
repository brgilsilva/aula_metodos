package atividadePoo2;

public class Funcionario {

    private int codFunc;
    private String nomeFunc;
    private int telFunc;
    private String cargoFunc;
    private float salarioFunc;

    public Funcionario(int codFunc, String nomeFunc, int telFunc, String cargoFunc, float salarioFunc) {
        this.codFunc = codFunc;
        this.nomeFunc = nomeFunc;
        this.telFunc = telFunc;
        this.cargoFunc = cargoFunc;
        this.salarioFunc = salarioFunc;
    }

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public int getTelFunc() {
        return telFunc;
    }

    public void setTelFunc(int telFunc) {
        this.telFunc = telFunc;
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

    public void setCargoFunc(String cargoFunc) {
        this.cargoFunc = cargoFunc;
    }

    public float getSalarioFunc() {
        return salarioFunc;
    }

    public void setSalarioFunc(float salarioFunc) {
        this.salarioFunc = salarioFunc;
    }

    public void visualizar (){
        System.out.println("Melhor funcionário da empresa é: "+nomeFunc);
        System.out.println("O salário dele é: " + salarioFunc);
    }
}
