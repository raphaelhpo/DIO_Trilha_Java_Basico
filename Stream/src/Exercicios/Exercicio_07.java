package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercicio_07 {
        public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> numerosOrdenados = numeros.
        stream().
        sorted().
        collect(Collectors.toList());
        int tamanho = (int)numerosOrdenados.stream().count();
        System.out.println(numerosOrdenados.get(tamanho - 1));
    }
}
