package Abstracao.Exemplo_002_msn;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN Messenger: ");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook Messenger: ");
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();

        System.out.println("\nTelegram: ");
        Telegram tg = new Telegram();
        tg.enviarMensagem();
        tg.receberMensagem();
    }
}
