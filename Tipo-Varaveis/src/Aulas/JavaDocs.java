package Aulas;

public class JavaDocs {
    /**
    *@author Raphael
    *@version 1.0
    *@since 23/08/2024
    */

    /**
     * Método para somar dois números
     * @param num1 primeiro parâmetro recebendo primeiro valor para somar
     * @param num2 segundo parâmetro  recebendo segundo valor para somar
     * @return retorna o valor da soma inteira (int)
     */
    public int somar(int num1, int num2){
        return num1 + num2;
    }

    /* É possível gerar uma documentação automática para seu programa
     * Para isso basta utiliza o seguinte comando no CMD:
     * javadoc -encoding utf-8 -docencoding ISO-8859-1 -d ../docs Aulas/*.java */
     
}
