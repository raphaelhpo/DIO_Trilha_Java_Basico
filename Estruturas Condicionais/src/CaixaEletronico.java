public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        //Condições Simples + Compostas
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado");
            System.out.println("Seu novo saldo e: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
            System.out.println("Seu saldo e: " + saldo);
        }
    }
}
