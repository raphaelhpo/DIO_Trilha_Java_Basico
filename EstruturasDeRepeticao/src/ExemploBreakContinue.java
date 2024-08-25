public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            //Para a execução do loop ou método, etc...
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            //Apenas não faz a iteração, mas não sai do loop.
            }
            System.out.println(i);
        }
    }
}
