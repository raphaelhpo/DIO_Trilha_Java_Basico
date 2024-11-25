import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Exercicio_2 {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        List<String> velocidadesList = Arrays.asList(velocidades);
        Optional<String> quedaConexao = velocidadesList.stream().filter(v -> v.equals("0")).findFirst();

        if(quedaConexao.isPresent()){
            return "Queda de Conexao";
        } else {
            return "Sem Quedas";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}