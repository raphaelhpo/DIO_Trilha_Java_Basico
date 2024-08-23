package Aulas;

import java.util.Scanner;
public class Scanner_CMD_Java {

    public static void main(String[] args) {
        /*Algo interessante a frezar é que aqui temos um exemplo de como usar o Scanner
        Entretanto também é possível receber dados diretamente do CMD utilizando o Array que 
        é passado como argumento logo ali em cima no main */

        String[] nome = new String[2];
        String[] sobrenome = new String[2];

        nome[0] = "Raphael";
        sobrenome[0] = "Orati";

        nome[1] = "Joaquim";
        sobrenome[1] = "Dias";

        Scanner ler = new Scanner(System.in);

        /*Com scanner, podemos ler dados do CMD Também
        Mas o utilizando o array é necessário 
        colocar os parâmetros ao lado da classe na hora da execução
        */
        System.out.println("Qual seu nome?");
        ler.nextLine();
    }
}
