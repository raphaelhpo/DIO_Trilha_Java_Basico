package Heranca.Exemplo_002_msn;

import Encapsulamento.Exemplo_002_msn.MSNMesseger;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        MSNMesseger msn = new MSNMesseger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();

        Telegram tg = new Telegram();
        tg.enviarMensagem();
        tg.receberMensagem();
    }
}
