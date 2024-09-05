package Heranca;

public class Pista_de_corrida {
    public static void main(String[] args) {
        Moto Z400 = new Moto();
        Z400.setChassi("1234-abcd");
        Z400.ligar();

        Carro fusca = new Carro();
        fusca.setChassi("4567-abcd");
        fusca.ligar();

        Veiculo lamborghini = new Carro();
        lamborghini.setChassi("7890-abcd");
        lamborghini.ligar();
    }
}
