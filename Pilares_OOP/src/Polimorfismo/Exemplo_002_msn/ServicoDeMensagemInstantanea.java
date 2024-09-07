package Polimorfismo.Exemplo_002_msn;

public abstract class ServicoDeMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectividadeInternet() {
        System.out.println("Verificando conectividade com a internet");
    }
}
