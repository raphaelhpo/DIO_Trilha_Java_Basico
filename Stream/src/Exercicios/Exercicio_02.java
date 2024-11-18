package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio_02 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        numeros.
        stream().
        filter(n -> n % 2 == 0).
        reduce((n1, n2) -> n1 + n2).
        ifPresent(System.out::println);

    }
}
