package atividadePoo1;

public class TestaCliente {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente(01,123456789, "João da Silva", 99999444, "Masculino");
        System.out.println("Nome do cliente: " +cliente1.getNomeCli());
        System.out.println(("Tel do cliente: "+cliente1.getTelCli()));

    }
}
