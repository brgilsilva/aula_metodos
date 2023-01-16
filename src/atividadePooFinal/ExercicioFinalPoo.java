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
package atividadePoo1;

public class TestaCliente {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente(01,123456789, "João da Silva", 99999444, "Masculino");
        cliente1.visualizar();

    }
}
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
package atividadePoo2;

public class TestaFuncionario {
    public static void main(String[] args) {

        atividadePoo2.Funcionario func1 = new atividadePoo2.Funcionario(01,"Bruno Gilberto",999554455,"Desenvolvedor Senior", 25000);

        func1.visualizar();


    }
}
package atividadePoo3;

public class Produto {
    private int cod;
    private String vedeoGame;
    private String acessorio;
    private String jogos;
    private float preco;

    public Produto(int cod, String vedeoGame, String acessorio, String jogos, float preco) {
        this.cod = cod;
        this.vedeoGame = vedeoGame;
        this.acessorio = acessorio;
        this.jogos = jogos;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getVedeoGame() {
        return vedeoGame;
    }

    public void setVedeoGame(String vedeoGame) {
        this.vedeoGame = vedeoGame;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizar(){
        System.out.println("O produto escolhido foi: "+vedeoGame);
        System.out.println("O preço final é de: "+preco);

    }
}
package atividadePoo3;

public class TestaGames {
    public static void main(String[] args) {

        atividadePoo3.Produto venda1 = new atividadePoo3.Produto(03,"Playstation4","2 Controles","Sem jogos",4500);
        venda1.visualizar();

    }
}
package atividadePoo4;

public class Ingresso {

    private String filme;
    private String duracao;
    private String horario;
    private float valor;
    private int sala;

    public Ingresso(String filme, String duracao, String horario, float valor, int sala) {
        this.filme = filme;
        this.duracao = duracao;
        this.horario = horario;
        this.valor = valor;
        this.sala = sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void visualizar(){
        System.out.println("O filme "+filme+" começará as "+horario+" na sala "+sala);
    }
}

package atividadePoo4;

public class TesteIngresso {
    public static void main(String[] args) {

        atividadePoo4.Ingresso ingresso = new atividadePoo4.Ingresso("Senhor dos Anéis","4h20","14h",15,2);

        ingresso.visualizar();


    }
}
package atividadePoo5;

public class Farmacia {
    private int cod;
    private String remedio;
    private int quantidade;
    private float valor;
    private String receita;

    public Farmacia(int cod, String remedio, int quantidade, float valor, String receita) {
        this.cod = cod;
        this.remedio = remedio;
        this.quantidade = quantidade;
        this.valor = valor;
        this.receita = receita;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
    public void visualizar(){
        System.out.println("O medicamento escolhido foi o "+remedio+" no valor de R$"+valor+ " cada.");
        System.out.println("É necessario receita para este medicamento? "+receita);

    }
}
package atividadePoo5;

public class TestaFarmacia {
    public static void main(String[] args) {
        atividadePoo5.Farmacia remedio = new atividadePoo5.Farmacia(23,"Antibiótico",14,32,"Sim");

        remedio.visualizar();

    }
}
package atividadePoo6;

public class Curso {
    private int cod;
    private String nome;
    private int duracao;
    private float valor;
    private String modalidade;

    public Curso(int cod, String nome, int duracao, float valor, String modalidade) {
        this.cod = cod;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public void visualizar(){
        System.out.println("O curso de "+nome+ " possui duração de "+duracao+" meses, no valor mensal de R$"+valor+ " e na modalidade "+modalidade);
    }
}


package atividadePoo6;

public class TestaCurso {
    public static void main(String[] args) {
        atividadePoo6.Curso curso = new atividadePoo6.Curso(44,"Redes de computadores",24,99.9f,"EAD");
        curso.visualizar();
    }
}
