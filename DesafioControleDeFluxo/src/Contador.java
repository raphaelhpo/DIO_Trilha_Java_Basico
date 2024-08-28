import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("");
        int num1 = ler.nextInt();
        ler.nextLine();

        System.out.println("");
        int num2 = ler.nextInt();
        ler.nextLine();

        try{
            conta(num1, num2);
        }catch(ParametrosInvalidosException e){
            e.printStackTrace();
        }
        
    }
    public static void conta(int parNum1, int parNum2) throws ParametrosInvalidosException{
        int diferenca = parNum2 - parNum1;
            
        for(int i = 0; i<=diferenca; i++){
                System.out.println(i);
        }
    }
}
