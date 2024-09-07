package Polimorfismo.Exemplo_002_msn;

public class FacebookMessenger extends ServicoDeMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConectividadeInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
