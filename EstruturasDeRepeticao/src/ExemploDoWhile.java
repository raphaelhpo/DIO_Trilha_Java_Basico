import java.util.Random;
//DO-WHILE tem a finalidade de executar pelo menos uma vez e depois executar o bloco de código.


public class ExemploDoWhile {
    public static void main(String[] args) {
        
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?" + atendeu);

        return !atendeu;
    }
}
