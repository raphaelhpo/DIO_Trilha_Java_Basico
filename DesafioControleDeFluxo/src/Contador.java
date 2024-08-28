import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int num1 = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite o segundo valor:");
        int num2 = ler.nextInt();
        ler.nextLine();

        try{
            if(num1 >= num2){
                throw new ParametrosInvalidosException();
            }
            conta(num1, num2);
        }catch(ParametrosInvalidosException e){
            System.out.println("Erro: o segundo valor deve ser maior que o primeiro.");
            e.printStackTrace();
        }
        
    }
    public static void conta(int parNum1, int parNum2) throws ParametrosInvalidosException{
        int diferenca = parNum2 - parNum1;
            
        for(int i = 1; i<diferenca+1; i++){
                System.out.println(i);
        }
    }
}
