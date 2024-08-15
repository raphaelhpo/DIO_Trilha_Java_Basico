public class Tipos_variaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2022;
        int populacao = 2000000;
        long populacaoBrasil = 2100000000l;
        float preco = 3.14f;
        double valor = 3.1415;
        char letra = 'a';
        boolean status = true;

        //Exemplo de casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        //Constantes
        final double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);

        
    }
}
