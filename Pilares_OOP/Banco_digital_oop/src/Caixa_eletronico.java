import Conta.*;

public class Caixa_eletronico {
    public static void main(String[] args) {
        Conta conta1 = new Conta_corrente();
        Conta conta2 = new Conta_poupanca();
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        conta1.depositar(100.00);
        conta1.transferir(50.00, conta2);
        
        conta2.sacar(25.00);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
