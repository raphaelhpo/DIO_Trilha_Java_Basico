package Encapsulamento.Exemplo_001;

public class Pista_de_corrida {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.ligar();
        /*fusca.verificandoCambio();
        fusca.verificargasolina();
        Caso tente chamar esses métodos, eles não serão vísiveis.
        Mas, estão emcapsulados no método "ligar".
        */
    }
}
