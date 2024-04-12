/**
 * Classe para representar uma ordem de compra de um título.
 */
public class OrdemCompra extends Movimento implements GerirTransacoes {
    
    private double valorMaximo; // Valor máximo para a ordem de compra
    
    /**
     * Construtor para a classe OrdemCompra.
     * @param titulo O título relacionado à ordem de compra.
     * @param dataTransacao A data da transação.
     * @param horaTransacao A hora da transação.
     * @param carteira A carteira associada à transação.
     * @param valorMaximo O valor máximo para a ordem de compra.
     */
    public OrdemCompra(Titulo titulo,  String dataTransacao, String horaTransacao, Carteira carteira, double valorMaximo){
        super(dataTransacao, horaTransacao, carteira);
        this.valorMaximo = valorMaximo;
    }
    
    /**
     * Obtém o valor máximo para a ordem de compra.
     * @return O valor máximo para a ordem de compra.
     */
    public Double getValorMaximo(double valorMaximo){
        return valorMaximo;
    }
    
    /**
     * Define o valor máximo para a ordem de compra.
     * @param valorMax O valor máximo a ser definido.
     */
    public void setValorMaximo(double valorMax){
        this.valorMaximo = valorMax;
    }
    
    /**
     * Método para consultar a ordem de compra.
     */
    @Override
    public void consultar(){
        // Implementar a lógica para consultar a ordem de compra
    }
    
    /**
     * Método para efetuar a ordem de compra.
     */
    @Override
    public void efectuar(){
        // Implementar a lógica para efetuar a ordem de compra
    }
}
