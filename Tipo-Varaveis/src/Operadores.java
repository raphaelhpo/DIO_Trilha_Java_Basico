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

        //Operadores Unarios
        int num3 = 10;
        num3++;
        num3--;
        ++num3;
        --num3;
           
        System.out.println(num3);


    }
}
