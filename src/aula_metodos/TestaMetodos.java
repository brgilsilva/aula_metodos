package aula_metodos;

public class TestaMetodos {

    public static void main(String[] args) {
//	        Chamadas dos Métodos criados na Classe TestaMétodos
        metodoPublico();
        metodoFriendly();
        metodoProtegido();
        metodoPrivado();

        Classe1.metodoPublico1();
        Classe1.metodoFriendly1();
        Classe1.metodoProtegido1();


        pacote1.ClassePacote1.metodoPublicoPacote1();

    }

//	Métodos da Classe TestaMétodos

    //Método Public
    public static void metodoPublico(){
        System.out.println("Método Público - Classe Testa Métodos");
    }

    //Método Friendly
    static void metodoFriendly(){
        System.out.println("Método Friendly - Classe Testa Métodos");
    }

    //Método Protected
    protected static void metodoProtegido(){
        System.out.println("Método Protegido - Classe Testa Métodos");
    }

    //Método Private
    private static void metodoPrivado(){
        System.out.println("Método Privado - Classe Testa Métodos");
    }

}
