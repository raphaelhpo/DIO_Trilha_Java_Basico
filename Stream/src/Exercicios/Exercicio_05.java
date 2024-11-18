package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio_05 {
        public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
        Long quantidadeMaiorQueCinco = numeros.
        stream().
        filter(n-> n > 5).
        count();
        System.out.println(quantidadeMaiorQueCinco);

        numeros.
        stream().
        filter(n-> n > 5).
        reduce((n1, n2) -> n1 + n2).
        map(n-> n/quantidadeMaiorQueCinco).
        ifPresent(System.out::println);
        
    }
}
