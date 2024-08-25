import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = ler.nextDouble();
        //Condicionais Simples + Compostas
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
