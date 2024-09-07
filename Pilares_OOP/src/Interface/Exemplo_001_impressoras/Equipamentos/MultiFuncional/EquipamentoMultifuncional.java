package Interface.Exemplo_001_impressoras.Equipamentos.MultiFuncional;

import Interface.Exemplo_001_impressoras.Equipamentos.Copiadora.Copiadora;
import Interface.Exemplo_001_impressoras.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Exemplo_001_impressoras.Equipamentos.Impressora.Impressora;


public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void copiar() {
        System.out.println("Copiando via Multifuncional...");
    }

    @Override
    public void Digitalizar() {
        System.out.println("Digitalizando via Multifuncional...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Multifuncional...");
    }



}
