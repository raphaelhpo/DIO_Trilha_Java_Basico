//O For tem a finalidade de executar até o ponto especificado
public class ExemploFor {
    public static void main(String[] args) throws Exception {
        for(int i=1; i <= 20; i++) {
            System.out.println("Carneiro: " + i);
        }
        System.out.println("Fim do programa");
        
        //ForEach em Array
        String[] lista = {"Felipe", "Jonas", "Julia", "Marcos"};
        for(String nome : lista) {
            System.out.println(nome);
        }
        //For em array
        /*for (int i = 0; i < lista.length; i++){
            System.out.println("Aluno:"+lista[i]);
        }*/
    }
}
