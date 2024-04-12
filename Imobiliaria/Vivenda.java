/**
 * A classe Vivenda é uma subclasse de Imovel e representa um tipo específico de imóvel,
 * caracterizado pelo número de pisos e preço.
 */
public class Vivenda extends Imovel {
    private int numeroPisos; // O número de pisos da vivenda
    private double preco; // O preço da vivenda

    /**
     * Construtor da classe Vivenda.
     * @param anoConstrucao O ano de construção da vivenda.
     * @param area A área da vivenda.
     * @param localizacao A localização da vivenda.
     * @param numeroPisos O número de pisos da vivenda.
     * @param preco O preço da vivenda.
     */
    public Vivenda(int anoConstrucao, double area, String localizacao, int numeroPisos, double preco) {
        super(anoConstrucao, area, localizacao);
        this.numeroPisos = numeroPisos;
        this.preco = preco;
    }

    /**
     * Obtém o número de pisos da vivenda.
     * @return O número de pisos da vivenda.
     */
    public int getNumeroPisos() {
        return numeroPisos;
    }

    /**
     * Define o número de pisos da vivenda.
     * @param numeroPisos O número de pisos da vivenda.
     */
    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    /**
     * Obtém o preço da vivenda.
     * @return O preço da vivenda.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço da vivenda.
     * @param preco O preço da vivenda.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
