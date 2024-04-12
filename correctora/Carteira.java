/**
 * A classe Carteira representa a carteira de investimentos de um cliente na imobiliária.
 * Ela armazena informações sobre o número da carteira, data de abertura, valor atual, títulos associados,
 * funcionário responsável, cliente associado e movimentos realizados.
 */
public class Carteira {
    
    private int numCarteira; // Número da carteira
    private String dataAbertura; // Data de abertura da carteira
    private int valorActual; // Valor atual da carteira
    private Titulo[] titulos; // Array para armazenar os títulos associados à carteira
    private int qtdTitulos; // Quantidade atual de títulos na carteira
    private Funcionario funcionario; // Funcionário responsável pela carteira
    private Cliente cliente; // Cliente associado à carteira
    private Movimento[] movimentos; // Array para armazenar os movimentos realizados na carteira
    
    /**
     * Construtor da classe Carteira.
     * @param numero O número da carteira.
     * @param abertura A data de abertura da carteira.
     * @param valor O valor inicial da carteira.
     */
    public Carteira(int numero, String abertura, int valor) {
        this.numCarteira = numero;
        this.dataAbertura = abertura;
        this.valorActual = valor;
        this.movimentos = new Movimento[3000];
        this.titulos = new Titulo[1000];
    }

    /**
     * Obtém o número da carteira.
     * @return O número da carteira.
     */
    public int getNumCarteira() {
        return numCarteira;
    }

    /**
     * Define o número da carteira.
     * @param numCarteira O novo número da carteira.
     */
    public void setNumCarteira(int numCarteira) {
        this.numCarteira = numCarteira;
    }

    /**
     * Obtém a data de abertura da carteira.
     * @return A data de abertura da carteira.
     */
    public String getDataAbertura() {
        return dataAbertura;
    }

    /**
     * Define a data de abertura da carteira.
     * @param dataAbertura A nova data de abertura da carteira.
     */
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * Obtém o valor atual da carteira.
     * @return O valor atual da carteira.
     */
    public int getValorActual() {
        return valorActual;
    }

    /**
     * Define o valor atual da carteira.
     * @param valorActual O novo valor atual da carteira.
     */
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    /**
     * Obtém os títulos associados à carteira.
     * @return Os títulos associados à carteira.
     */
    public Titulo[] getTitulos() {
        return titulos;
    }

    /**
     * Define os títulos associados à carteira.
     * @param titulos Os novos títulos associados à carteira.
     */
    public void setTitulos(Titulo[] titulos) {
        this.titulos = titulos;
    }

    /**
     * Obtém o funcionário responsável pela carteira.
     * @return O funcionário responsável pela carteira.
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Define o funcionário responsável pela carteira.
     * @param funcionario O novo funcionário responsável pela carteira.
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Obtém o cliente associado à carteira.
     * @return O cliente associado à carteira.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado à carteira.
     * @param cliente O novo cliente associado à carteira.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /**
     * Calcula o total de dinheiro investido na carteira.
     * @return O total de dinheiro investido na carteira.
     */
    public void getTotalEmDinheiro() {
        // Implementação para calcular o total em dinheiro investido na carteira
    }
    
    /**
     * Obtém os movimentos realizados na carteira.
     * @return Os movimentos realizados na carteira.
     */
   
