/**
 * Classe para representar um cliente da imobiliária.
 * Um cliente possui informações como nome, sobrenome, endereço, email, bilhete de identidade e idade.
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String endereco;
    private String email;
    private String bilhete_ident;
    private int idade;

    /**
     * Construtor da classe Cliente.
     * @param nome O nome do cliente.
     * @param sobrenome O sobrenome do cliente.
     * @param endereco O endereço do cliente.
     * @param email O email do cliente.
     * @param bilhete_ident O bilhete de identidade do cliente.
     * @param idade A idade do cliente.
     */
    public Cliente(String nome, String sobrenome, String endereco, String email, String bilhete_ident, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.email = email;
        this.bilhete_ident = bilhete_ident;
        this.idade = idade;
    }

    /**
     * Obtém o nome do cliente.
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     * @param nome O novo nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome do cliente.
     * @return O sobrenome do cliente.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome do cliente.
     * @param sobrenome O novo sobrenome do cliente.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém o endereço do cliente.
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     * @param endereco O novo endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o email do cliente.
     * @return O email do cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do cliente.
     * @param email O novo email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o bilhete de identidade do cliente.
     * @return O bilhete de identidade do cliente.
     */
    public String getBilhete_ident() {
        return bilhete_ident;
    }

    /**
     * Define o bilhete de identidade do cliente.
     * @param bilhete_ident O novo bilhete de identidade do cliente.
     */
    public void setBilhete_ident(String bilhete_ident) {
        this.bilhete_ident = bilhete_ident;
    }

    /**
     * Obtém a idade do cliente.
     * @return A idade do cliente.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do cliente.
     * @param idade A nova idade do cliente.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Retorna uma representação em string do objeto Cliente.
     * @return Uma string representando o objeto Cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", bilhete_ident='" + bilhete_ident + '\'' +
                ", idade=" + idade +
                '}';
    }
}
