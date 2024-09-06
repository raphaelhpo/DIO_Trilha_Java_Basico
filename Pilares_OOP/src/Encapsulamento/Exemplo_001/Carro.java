package Encapsulamento.Exemplo_001;

public class Carro {
    
    public void ligar(){
        verificargasolina();
        verificandoCambio();
        System.out.println("Carro ligado.");
    }
    private void verificargasolina(){
        System.out.println("Verificando Gasolina...");
    }
    private void verificandoCambio(){
        System.out.println("Verificando Cambio...");
    }
}
