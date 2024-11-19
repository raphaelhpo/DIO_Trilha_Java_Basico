package Conta;

public abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        saldo = 0;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor; //Ou saldo += valor
        System.out.println(String.format("Deposito de %.2f realizado com sucesso!", valor));
    };
    public void sacar(double valor){
        this.saldo = saldo - valor; //OU saldo -= valor
        System.out.println(String.format("Saque de %.2f realizado com sucesso!", valor));
    };
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    };

    abstract public void imprimirExtrato();

    protected void infosConta() {
        // TODO Auto-generated method stub
        System.out.println(String.format("Nome Cliente: %s\nAgencia: %d\nConta: %d\nSaldo: %.2f", this.cliente.getNome(),this.agencia, this.numero, this.saldo));
    }
}
