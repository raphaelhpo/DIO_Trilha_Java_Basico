package Heranca.Exemplos_001;

public class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void ligar() {
        System.out.println("Veiculo ligado.");
    }
}
