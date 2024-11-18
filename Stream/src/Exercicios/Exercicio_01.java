package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio_01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 3, 4, 1);

        Stream<Integer> numerosOrdenados = numeros.
        stream().
        sorted();

        numerosOrdenados.forEach(n -> System.out.println(n));
    }
}
