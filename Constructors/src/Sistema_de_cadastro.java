public class Sistema_de_cadastro {

    public static void main(String[] args) {    
        Pessoa pessoa_001 = new Pessoa("Raphael", "111.111.111-11");
        pessoa_001.setEndereco("Rua dos bobos, 0");
        
        Pessoa Pessoa_002 = new Pessoa();

        System.out.println(pessoa_001.getNome() + " mora na " + pessoa_001.getEndereco());
    }
}
