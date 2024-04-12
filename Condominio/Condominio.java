/**
 * A classe Condominio representa um conjunto de edifícios localizados em uma determinada cidade e bairro.
 * Contém informações sobre o nome, cidade, bairro, edifícios e despesas comuns do condomínio.
 */
public class Condominio {

    String nome; // O nome do condomínio
    String cidade; // A cidade onde o condomínio está localizado
    String bairro; // O bairro onde o condomínio está localizado
    private Edificio[] edificios; // Os edifícios pertencentes ao condomínio
    private DespesasComuns[] despesas; // As despesas comuns do condomínio
    private int qtdEdificios = 0; // O número atual de edifícios no condomínio
    private int qtdDespesas = 0; // O número atual de despesas comuns no condomínio
    
    /**
     * Construtor padrão da classe Condominio.
     */
    public Condominio() {}

    /**
     * Construtor da classe Condominio.
     * @param nome O nome do condomínio.
     * @param cidade A cidade onde o condomínio está localizado.
     * @param bairro O bairro onde o condomínio está localizado.
     * @param capacidade A capacidade máxima de edifícios que o condomínio pode armazenar.
     */
    public Condominio(String nome, String cidade, String bairro, int capacidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.edificios = new Edificio[capacidade];
        this.despesas = new DespesasComuns[100];
    }

    /**
     * Obtém o número de edifícios no condomínio.
     * @return O número de edifícios no condomínio.
     */
    public int getQtdEdificios() {
        return qtdEdificios;
    }

    /**
     * Obtém o nome do condomínio.
     * @return O nome do condomínio.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condomínio.
     * @param nome O nome do condomínio.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a cidade onde o condomínio está localizado.
     * @return A cidade onde o condomínio está localizado.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Obtém o número de despesas comuns no condomínio.
     * @return O número de despesas comuns no condomínio.
     */
    public int getQtdDespesas() {
        return qtdDespesas;
    }

    /**
     * Define a cidade onde o condomínio está localizado.
     * @param cidade A cidade onde o condomínio está localizado.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o bairro onde o condomínio está localizado.
     * @return O bairro onde o condomínio está localizado.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro onde o condomínio está localizado.
     * @param bairro O bairro onde o condomínio está localizado.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Adiciona um novo edifício ao condomínio.
     * @param novoEdificio O novo edifício a ser adicionado.
     */
    public void adicionarEdificio(Edificio novoEdificio) {
        this.edificios[this.qtdEdificios++] = novoEdificio;
    }

    /**
     * Retorna uma representação em string do objeto Condominio.
     * @return Uma representação em string do objeto Condominio.
     */
    @Override
    public String toString() {
        return "Condomínios{\n" + "nome:" + nome + "\n cidade:" + cidade + "\n bairro:" + bairro + "\n edificios=" + edificios + "\n despesas=" + despesas + "\n qtdEdificios=" + qtdEdificios + '}';
    }
    
    /**
     * Registra uma nova despesa comum no condomínio.
     * @param novaDespesa A nova despesa comum a ser registrada.
     */
    public void registrarDespesa(DespesasComuns novaDespesa) {
        this.despesas[this.qtdDespesas++] = novaDespesa; 
    }
    
    /**
     * Calcula o total de despesas comuns do condomínio.
     * @return O total de despesas comuns do condomínio.
     */
    public int totalDespesas() {
        int soma = 0;
        for (int i = 0; i < qtdDespesas; i++) {
            soma += this.despesas[i].getValor();
        }
        return soma;
    }
    
    /**
     * Obtém um edifício específico do condomínio pelo seu índice.
     * @param nEdificio O índice do edifício desejado.
     * @return O edifício correspondente ao índice fornecido.
     */
    public Edificio pegarEdificio(int nEdificio) {
        return this.edificios[nEdificio];
    } 

}
