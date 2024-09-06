package Encapsulamento.Exemplo_002_msn;

public class MSNMesseger {
    public void enviarMensagem(){
        validarConectividadeInternet();
        System.out.println("Enviando mensagem.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem.");
    }
    private void validarConectividadeInternet(){
        System.out.println("Validando Conexão com a Internet.");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico.");
    }
}
