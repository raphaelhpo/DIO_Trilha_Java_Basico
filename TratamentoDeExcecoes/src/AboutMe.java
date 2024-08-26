import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = scan.nextLine();

            System.out.println("Digite seu Sobrenome:");
            String sobreNome = scan.nextLine();

        
            System.out.println("Digite sua idade:");
            int idade = scan.nextInt();
            scan.nextLine();
        

            System.out.println("Digite sua altura:");
            double altura = scan.nextDouble();
            scan.nextLine();

            //Imprimindo dados obtidos
            System.out.println("Olá, me chamo" + " " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
            System.out.println("Eu tenho" + " " + idade + " Anos");
            System.out.println("E minha altura é" + " " + altura + " " + "metros.");
        
        }catch(InputMismatchException e){
            System.out.println("Erro: Digite um valor numerico para os campos tamanho e idade.");
        }    
    }
}
