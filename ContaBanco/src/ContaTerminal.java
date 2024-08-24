import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, informe o número da sua conta: \n");
        int numeroConta =ler.nextInt();

        System.out.println("Por favor, informe a Agencia: \n");
        String agencia =ler.next();

        System.out.println("Por favor, informe o nome do Titular: \n");
        String nomeCliente =ler.next();

        System.out.println("Por favor, informe o saldo: \n");
        double saldo =ler.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
    }
}
