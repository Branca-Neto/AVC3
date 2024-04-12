/**
 * A classe Funcionario representa um funcionário de uma empresa.
 */
public class Funcionario {
    
    private int identificador; // O identificador único do funcionário
    private String nome; // O nome do funcionário
    private int telefone; // O número de telefone do funcionário
    private int idade; // A idade do funcionário
    private String endereco; // O endereço do funcionário
    private Empresa empresa; // A empresa em que o funcionário trabalha
    
    /**
     * Construtor padrão da classe Funcionario.
     */
    public Funcionario(){}
  
    /**
     * Construtor da classe Funcionario.
     * @param id O identificador único do funcionário.
     * @param nome O nome do funcionário.
     * @param telefone O número de telefone do funcionário.
     * @param idade A idade do funcionário.
     * @param endereco O endereço do funcionário.
     */
    public Funcionario(int id,  String nome, int telefone, int idade, String endereco){
        this.identificador = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
    }

    /**
     * Obtém a empresa em que o funcionário trabalha.
     * @return A empresa em que o funcionário trabalha.
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Define a empresa em que o funcionário trabalha.
     * @param empresa A empresa em que o funcionário trabalha.
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtém o endereço do funcionário.
     * @return O endereço do funcionário.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do funcionário.
     * @param endereco O endereço do funcionário.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o identificador único do funcionário.
     * @return O identificador único do funcionário.
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Define o identificador único do funcionário.
     * @param identificador O identificador único do funcionário.
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtém o nome do funcionário.
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a idade do funcionário.
     * @return A idade do funcionário.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do funcionário.
     * @param idade A idade do funcionário.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Define o nome do funcionário.
     * @param nome O nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de telefone do funcionário.
     * @return O número de telefone do funcionário.
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone do funcionário.
     * @param telefone O número de telefone do funcionário.
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
      
}
