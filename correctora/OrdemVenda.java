/**
 * Classe para representar uma ordem de venda de um título financeiro.
 * Uma ordem de venda é um tipo de movimento que envolve a venda de uma quantidade específica de um título a um determinado preço.
 */
public class OrdemVenda extends Movimento {
    
    private Titulo titulo; // O título financeiro a ser vendido
    private int quantidade; // A quantidade do título a ser vendida
    private double precoVenda; // O preço de venda do título

    /**
     * Construtor da classe OrdemVenda.
     * @param titulo O título financeiro a ser vendido.
     * @param quantidade A quantidade do título a ser vendida.
     * @param precoVenda O preço de venda do título.
     * @param dataTransacao A data da transação da ordem de venda.
     * @param horaTransacao A hora da transação da ordem de venda.
     * @param carteira A carteira associada à ordem de venda.
     */
    public OrdemVenda(Titulo titulo, int quantidade, double precoVenda, String dataTransacao, String horaTransacao, Carteira carteira) {
        super(dataTransacao, horaTransacao, carteira);
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
    }

    /**
     * Obtém a quantidade do título a ser vendida.
     * @return A quantidade do título a ser vendida.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do título a ser vendida.
     * @param quantidade A nova quantidade do título a ser vendida.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém o preço de venda do título.
     * @return O preço de venda do título.
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Define o preço de venda do título.
     * @param precoVenda O novo preço de venda do título.
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    /**
     * Obtém o título financeiro a ser vendido.
     * @return O título financeiro a ser vendido.
     */
    public Titulo getTitulo() {
        return titulo;
    }
    
    /**
     * Define o título financeiro a ser vendido.
     * @param titulo O novo título financeiro a ser vendido.
     */
    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }
}
