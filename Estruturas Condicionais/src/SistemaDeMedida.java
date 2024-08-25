import java.util.Scanner;

public class SistemaDeMedida {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma das opções (p),(m),(g): ");
        String tam = ler.nextLine();

        switch (tam) {
            case "p":
                System.out.println("PEQUENO");
                break;
            case "m":
                System.out.println("MEDIO");
                break;
            case "g":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
