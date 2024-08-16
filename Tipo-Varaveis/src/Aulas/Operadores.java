package Aulas;
import javax.swing.JOptionPane;

public class Operadores {

    public static void main(String[] args) {

        //Operadores aritméticos        
        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;

        //Concatenação
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String sobrenome = JOptionPane.showInputDialog("Qual o seu sobrenome?");
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        //Operadores Incrementais
        int num4 = 10;

        num4 += 5;
        num4 -= 5;
        num4 *= 5;
        num4 /= 5;
        num4 %= 5;

        System.out.println(num4);

        //Operadores booleanos
        boolean status = true;

        status = !true;

        System.out.println(status);

        //Operadores Unarios
        int num3 = 10;
        
        num3++;
        num3--;
        ++num3;
        --num3;
           
        System.out.println(num3);

        //operadores ternarios
        int num5 = 10;
        int num6 = 5;

        int num7 = num5 > num6 ? num5 : num6;

        /*
        A expressão ternária acima é igual a esse if else.
        if(num5 > num6){
            System.out.println(num5);
        }else{
            System.out.println(num6);
        }*/

        System.out.println(num7);

        //Operadores Relacionais
        int num8 = 10;
        int num9 = 5;

        boolean igual = num8 == num9; //igualdade
        boolean diferente = num8 != num9;//diferente
        boolean maior = num8 > num9;//maior que
        boolean menor = num8 < num9;//menor que
        boolean maiorOuIgual = num8 >= num9;//maior ou igual que
        boolean menorOuIgual = num8 <= num9;//menor ou igual que

        System.out.println(num8+"Igual="+num9+"="+igual+
        num8+"Diferente="+num9+"="+diferente+
        num8+"Maior="+num9+"="+maior+
        num8+"Menor="+num9+"="+ menor+
        num8+"Maiorouigual="+num9+"="+ maiorOuIgual+
        num8+"Menorouigual="+num9+"="+ menorOuIgual);

        //Comparação de objetos

        String nome1 = "Raphael";
        String nome2 = "Raphael";
        String nome3 = new String("Raphael");
        String nome4 = new String("Raphael");
        String nome5 = new String("raphael");

        boolean iguais = nome1.equals(nome2);
        boolean iguais2 = nome1.equals(nome3);
        boolean iguais3 = nome3.equals(nome4);
        boolean iguais4 = nome3.equals(nome5);

        boolean iguais5 = nome3.equalsIgnoreCase(nome5);
        boolean iguais6 = nome3.equalsIgnoreCase("raphael");
        boolean iguais7 = nome3.equalsIgnoreCase("Raphael");
        boolean iguais8 = nome3.equalsIgnoreCase("RApHAEL");

        System.out.println(iguais);
        System.out.println(iguais2);
        System.out.println(iguais3);
        System.out.println(iguais4);
        System.out.println(iguais5);
        System.out.println(iguais6);
        System.out.println(iguais7);
        System.out.println(iguais8);

        //operadores logicos
        boolean status2 = true;
        boolean status3 = false;

        boolean and = status2 && status3;
        boolean or = status2 || status3;
        boolean not = !status2;
    }
}
