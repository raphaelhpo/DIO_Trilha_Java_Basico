package Conta;
public class Conta_poupanca extends Conta {

    public Conta_poupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("***Extrato Conta Poupanca***");
        super.infosConta();
    }
}
