/**
 * A classe Cliente representa um cliente da imobiliária, contendo informações como nome, email e telefone.
 */
public class Cliente {
    private String nome; // O nome do cliente
    private String email; // O email do cliente
    private String telefone; // O telefone do cliente

    /**
     * Construtor da classe Cliente.
     * @param nome O nome do cliente.
     * @param email O email do cliente.
     * @param telefone O telefone do cliente.
     */
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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
     * @param nome O nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @param email O email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o telefone do cliente.
     * @return O telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do cliente.
     * @param telefone O telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
