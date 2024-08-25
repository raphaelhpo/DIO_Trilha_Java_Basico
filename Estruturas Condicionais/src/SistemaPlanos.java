import java.util.Scanner;

public class SistemaPlanos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção de Plano: ");
        System.out.println("1 - BASIC");
        System.out.println("2 - MIDIA");
        System.out.println("3 - TURBO");

        int plano = ler.nextInt();
//Dependendo da situação é importante saber utilziar o Break para parar o Switch.
        switch (plano) {
            case 3:
                System.out.println("5gb de youtube");
            case 2:
                System.out.println("whatsapp e instagram");
            case 1:  
                System.out.println("100 min de ligações.");
        }
    }
}
