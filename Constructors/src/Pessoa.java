public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    //Construtor Padrão, sem parametros, é "Obrigatório".
    public Pessoa(){
        super();
    }
    /*Tomar cuidado com os construtores, nem todos os Atriibutos são obrigatórios de serem incluidos inicialmente.
     */
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
