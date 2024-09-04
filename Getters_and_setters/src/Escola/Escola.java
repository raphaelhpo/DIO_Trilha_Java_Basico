package Escola;

public class Escola {
    public static void main(String args[]){
        Aluno Aluno_001 = new Aluno();
        Aluno_001.setNome("Raphael");
        Aluno_001.setIdade(23);

        System.out.println("O nome do Aluno e: " + Aluno_001.getNome() + "\nA idade do aluno e: " + Aluno_001.getIdade());
    }
}
