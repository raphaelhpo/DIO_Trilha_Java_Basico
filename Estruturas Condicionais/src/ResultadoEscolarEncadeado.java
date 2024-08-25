import java.util.Scanner;

public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = ler.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        /*
         * Condições de Expressões Ternárias
         * String resultado = nota >= 7.0 ? "Aprovado" : nota >=5.0 && nota < 7.0 ? "Recuperação" : "Reprovado";
         */
    }
}
