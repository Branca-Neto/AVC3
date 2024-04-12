/**
 * Classe para representar um movimento de transação.
 */
public class Movimento {
    
    private String dataTransacao; // Data da transação
    private String horaTransacao; // Hora da transação
    private Carteira carteira; // Carteira associada ao movimento
    
    /**
     * Construtor para a classe Movimento.
     * @param dataT A data da transação.
     * @param horaT A hora da transação.
     * @param cart A carteira associada ao movimento.
     */
    public Movimento(String dataT, String horaT, Carteira cart){
        this.dataTransacao = dataT;
        this.horaTransacao = horaT;
        this.carteira = cart;
    }
   
    /**
     * Obtém a data da transação.
     * @return A data da transação.
     */
    public String getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Define a data da transação.
     * @param dataTransacao A data da transação a ser definida.
     */
    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    /**
     * Obtém a hora da transação.
     * @return A hora da transação.
     */
    public String getHoraTransacao() {
        return horaTransacao;
    }

    /**
     * Define a hora da transação.
     * @param horaTransacao A hora da transação a ser definida.
     */
    public void setHoraTransacao(String horaTransacao) {
        this.horaTransacao = horaTransacao;
    }
    
    /**
     * Obtém a carteira associada ao movimento.
     * @return A carteira associada ao movimento.
     */
    public Carteira getCarteira(){
        return carteira;
    }
    
    /**
     * Define a carteira associada ao movimento.
     * @param carteira A carteira a ser associada ao movimento.
     */
    public void setCarteira(Carteira carteira){
        this.carteira = carteira;
    }    
}
