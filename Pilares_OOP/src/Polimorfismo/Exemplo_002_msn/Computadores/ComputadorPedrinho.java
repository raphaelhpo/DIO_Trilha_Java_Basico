package Polimorfismo.Exemplo_002_msn.Computadores;

import Polimorfismo.Exemplo_002_msn.FacebookMessenger;
import Polimorfismo.Exemplo_002_msn.MSNMessenger;
import Polimorfismo.Exemplo_002_msn.ServicoDeMensagemInstantanea;
import Polimorfismo.Exemplo_002_msn.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        ServicoDeMensagemInstantanea smi = null;

        String appEscolhido = "tg";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fb")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
