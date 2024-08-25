import java.util.concurrent.ThreadLocalRandom;
//O while tem a finalidade de executar até que a condição seja falsa.
//Ou seja, muitas vezes você n sabe até quando será finalizado.
public class ExemploWhile {
    public static void main(String[] args) {
        
        Double mesada = 50.00;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce: " + valorDoce + "Adicionado à sua cesta");
            mesada -= valorDoce;
        }
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2.0, 15.0);
    }
}
