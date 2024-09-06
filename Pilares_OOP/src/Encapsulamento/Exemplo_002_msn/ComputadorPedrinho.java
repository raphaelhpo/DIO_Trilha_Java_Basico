package Encapsulamento.Exemplo_002_msn;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMesseger msn = new MSNMesseger();
        /* Sem Emcapsulamento:       
         *  msn.validarConectividadeInternet();
         *  msn.enviarMensagem();
         *  msn.salvarHistoricoMensagem();
         *  msn.receberMensagem();
         */

        /* Com Emcapsulamento: 
         * Os métodos "validar" e "salvar" estão "escondidos" dentro do enviar.
        *  O usuário não precisa ter acesso a esses métodos do sistema.
        */
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
