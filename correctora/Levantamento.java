/**
 * Classe para representar um movimento de levantamento.
 */
public class Levantamento extends Movimento implements GerirTransacoes {
    private double valor; // Valor do levantamento
    
    /**
     * Construtor para a classe Levantamento.
     * @param valor O valor a ser levantado.
     * @param dataTransacao A data da transação.
     * @param horaTransacao A hora da transação.
     * @param carteira A carteira associada ao movimento.
     */
    public Levantamento(double valor, String dataTransacao, String horaTransacao, Carteira carteira){
        super(dataTransacao, horaTransacao, carteira);
        this.valor = valor;
    }
    
    /**
     * Obtém o valor do levantamento.
     * @return O valor do levantamento.
     */
    public double getValorDeposito(){
        return valor;
    }
    
    /**
     * Define o valor do levantamento.
     * @param valorLevantar O valor a ser definido para o levantamento.
     */
    public void setValorDeposito(double valorLevantar){
        this.valor = valorLevantar;
    }
    
    /**
     * Implementação do método da interface GerirTransacoes para efetuar um levantamento.
     */
    @Override
    public void efectuar(){
        // Implementação específica para efetuar o levantamento
    }
    
    /**
     * Implementação do método da interface GerirTransacoes para consultar informações sobre o levantamento.
     */
    @Override
    public void consultar(){
        // Implementação específica para consultar informações sobre o levantamento
    }
}
