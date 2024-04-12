/**
 * A classe Empresa representa uma empresa do setor imobiliário.
 */
public class Empresa {
    
    private String nome; // O nome da empresa
    private String NIF; // O número de identificação fiscal da empresa
    private String localizacao; // A localização da empresa
    private int telefone; // O número de telefone da empresa
    private String email; // O endereço de e-mail da empresa
    
    /**
     * Construtor padrão da classe Empresa.
     */
    public Empresa(){}
    
    /**
     * Construtor da classe Empresa.
     * @param nome O nome da empresa.
     * @param NIF O número de identificação fiscal da empresa.
     * @param localizacao A localização da empresa.
     * @param telefone O número de telefone da empresa.
     * @param email O endereço de e-mail da empresa.
     */
    public Empresa(String nome, String NIF, String localizacao, int telefone, String email){
        this.nome = nome;
        this.NIF = NIF;
        this.localizacao = localizacao;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Obtém o nome da empresa.
     * @return O nome da empresa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa.
     * @param nome O nome da empresa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de identificação fiscal da empresa.
     * @return O número de identificação fiscal da empresa.
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * Define o número de identificação fiscal da empresa.
     * @param NIF O número de identificação fiscal da empresa.
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * Obtém a localização da empresa.
     * @return A localização da empresa.
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Define a localização da empresa.
     * @param localizacao A localização da empresa.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * Obtém o número de telefone da empresa.
     * @return O número de telefone da empresa.
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone da empresa.
     * @param telefone O número de telefone da empresa.
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o endereço de e-mail da empresa.
     * @return O endereço de e-mail da empresa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de e-mail da empresa.
     * @param email O endereço de e-mail da empresa.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
