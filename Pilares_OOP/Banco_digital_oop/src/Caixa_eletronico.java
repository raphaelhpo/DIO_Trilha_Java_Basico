import Conta.Cliente;
import Conta.Conta;
import Conta.Conta_corrente;
import Conta.Conta_poupanca;

public class Caixa_eletronico {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente Cliente1 = new Cliente("Jorge");
        Cliente Cliente2 = new Cliente("Paulo");

        Conta conta1 = new Conta_corrente(Cliente1);
        Conta conta2 = new Conta_poupanca(Cliente1);

        Conta conta1_1 = new Conta_corrente(Cliente2);
        Conta conta2_1 = new Conta_poupanca(Cliente2);

        banco.contas.add(conta1);
        banco.contas.add(conta2);

        conta1.depositar(100.00);
        conta1.transferir(50.00, conta2);
        conta2.sacar(25.00);

        System.out.println("\n");

        conta1_1.depositar(110.00);
        conta1_1.transferir(60.00, conta2_1);
        conta2_1.sacar(30.00);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        conta1_1.imprimirExtrato();
        conta2_1.imprimirExtrato();

        
    }
}
