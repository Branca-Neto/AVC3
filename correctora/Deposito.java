/**
 * Classe para representar um depósito em uma carteira.
 * Herda da classe Movimento e implementa a interface GerirTransacoes.
 */
public class Deposito extends Movimento implements GerirTransacoes {
    private double valor; // Valor do depósito
    
    /**
     * Construtor da classe Deposito.
     * @param valor O valor do depósito
     * @param dataTransacao A data da transação
     * @param horaTransacao A hora da transação
     * @param carteira A carteira onde o depósito será realizado
     */
    public Deposito(double valor, String dataTransacao, String horaTransacao, Carteira carteira){
        super(dataTransacao, horaTransacao, carteira);
        this.valor = valor;
    }
    
    /**
     * Obtém o valor do depósito.
     * @return O valor do depósito
     */
    public double getValorDeposito(){
        return valor;
    }
    
    /**
     * Define o valor do depósito.
     * @param valorDeposito O valor do depósito a ser definido
     */
    public void setValorDeposito(double valorDeposito){
        this.valor = valorDeposito;
    }
    
    /**
     * Método para efetuar o depósito.
     * Implementação da interface GerirTransacoes.
     */
    @Override
    public void efectuar(){
        // Implementação da lógica para efetuar o depósito
    }
    
    /**
     * Método para consultar informações sobre o depósito.
     * Implementação da interface GerirTransacoes.
     */
    @Override
    public void consultar(){
        // Implementação da lógica para consultar informações sobre o depósito
    }
}
