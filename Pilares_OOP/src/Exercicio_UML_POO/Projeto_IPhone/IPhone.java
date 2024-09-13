package Exercicio_UML_POO.Projeto_IPhone;

import Exercicio_UML_POO.Projeto_IPhone.Funcionalidades.Aparelho_telefonico;
import Exercicio_UML_POO.Projeto_IPhone.Funcionalidades.Reprodutor_musical;
import Exercicio_UML_POO.Projeto_IPhone.Funcionalidades.Navegador_internet;

public class IPhone implements Reprodutor_musical, Aparelho_telefonico, Navegador_internet {

    @Override
    public void exibir_pagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }
    @Override
    public void atualizar_pagina() {
        System.out.println("Atualizando pagina...");
    }
    @Override
    public void adicionar_nova_aba() {
        System.out.println("Nova Aba Aberta");
    }

    @Override
    public void ligar(String telefone) {
        System.out.println("Ligando para: " + telefone);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo");
    }
    @Override
    public void iniciar_correio_de_voz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }
    @Override
    public void pausar() {
        System.out.println("Musica Pausada.");
    }
    @Override
    public void selecionar_musica(String musica) {
        System.out.println("Selecionando musica: " + musica);
        tocar();
    }
}
