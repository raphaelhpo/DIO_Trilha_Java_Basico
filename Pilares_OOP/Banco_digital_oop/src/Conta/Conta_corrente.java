package Conta;
public class Conta_corrente extends Conta {

    public Conta_corrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("***Extrato Conta Corrente***");
        super.infosConta();
    }
}
