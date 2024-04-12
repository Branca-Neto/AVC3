/**
 * A classe Apartamento é uma subclasse de Imovel e representa um tipo específico de imóvel,
 * caracterizado por uma tipologia e um preço.
 */
public class Apartamento extends Imovel {
    private String tipologia; // A tipologia do apartamento (por exemplo, "T1", "T2", etc.)
    private double preco; // O preço do apartamento

    /**
     * Construtor da classe Apartamento.
     * @param anoConstrucao O ano de construção do apartamento.
     * @param area A área do apartamento.
     * @param localizacao A localização do apartamento.
     * @param tipologia A tipologia do apartamento.
     * @param preco O preço do apartamento.
     */
    public Apartamento(int anoConstrucao, double area, String localizacao, String tipologia, double preco) {
        super(anoConstrucao, area, localizacao);
        this.tipologia = tipologia;
        this.preco = preco;
    }

    /**
     * Obtém a tipologia do apartamento.
     * @return A tipologia do apartamento.
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Define a tipologia do apartamento.
     * @param tipologia A tipologia do apartamento.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    /**
     * Obtém o preço do apartamento.
     * @return O preço do apartamento.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do apartamento.
     * @param preco O preço do apartamento.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
