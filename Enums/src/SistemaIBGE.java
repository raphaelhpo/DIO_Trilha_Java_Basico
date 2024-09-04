public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome() + " - " + estado.getNomeMaiusculo());
        }

        EstadoBrasileiro es = EstadoBrasileiro.SAO_PAULO;
        
        System.out.println(es.getSigla() + " - " + es.getNome() + " - " + es.getNomeMaiusculo());
        //Enums São para valores pré estabelecidos
    }
}
