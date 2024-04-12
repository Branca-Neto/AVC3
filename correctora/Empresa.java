/**
 * Classe para representar uma empresa.
 */
public class Empresa {
    
    private String nome; // Nome da empresa
    private String endereco; // Endereço da empresa
    private String areaAtuacao; // Área de atuação da empresa
    
    /**
     * Construtor padrão da classe Empresa.
     */
    public Empresa(){}
    
    /**
     * Construtor da classe Empresa.
     * @param nome Nome da empresa
     * @param endereco Endereço da empresa
     * @param area Área de atuação da empresa
     */
    public Empresa(String nome, String endereco, String area){
        this.nome = nome;
        this.endereco = endereco;
        this.areaAtuacao = area;
    }

    // Getters e setters para os atributos da classe

    /**
     * Obtém o nome da empresa.
     * @return Nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa.
     * @param nome Nome da empresa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço da empresa.
     * @return Endereço da empresa
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da empresa.
     * @param endereco Endereço da empresa
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a área de atuação da empresa.
     * @return Área de atuação da empresa
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define a área de atuação da empresa.
     * @param areaAtuacao Área de atuação da empresa
     */
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Retorna uma representação em string da empresa.
     * @return Uma representação em string da empresa
     */
    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }
}
