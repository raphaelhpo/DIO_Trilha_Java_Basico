package Interface.Exemplo_001_impressoras.Estabelecimento;

import Interface.Exemplo_001_impressoras.Equipamentos.Copiadora.Copiadora;
import Interface.Exemplo_001_impressoras.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Exemplo_001_impressoras.Equipamentos.Impressora.Impressora;
import Interface.Exemplo_001_impressoras.Equipamentos.MultiFuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();

    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;
    
    impressora.imprimir();
    digitalizadora.Digitalizar();
    copiadora.copiar();
        
    }
}
