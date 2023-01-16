package atividadePoo6;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso(44,"Redes de computadores",24,99.9f,"EAD");
        System.out.println("O curso de "+curso.getNome()+ " possui duração de "+curso.getDuracao()+" meses, no valor mensal de R$"+curso.getValor()+ " e na modalidade "+curso.getModalidade());
    }
}
