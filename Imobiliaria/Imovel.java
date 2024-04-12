/**
 * A classe Imovel é uma classe abstrata que serve como base para representar um imóvel genérico,
 * caracterizado por ano de construção, área e localização.
 */
public abstract class Imovel {
    private int anoConstrucao; // O ano de construção do imóvel
    private double area; // A área do imóvel
    private String localizacao; // A localização do imóvel

    /**
     * Construtor da classe Imovel.
     * @param anoConstrucao O ano de construção do imóvel.
     * @param area A área do imóvel.
     * @param localizacao A localização do imóvel.
     */
    public Imovel(int anoConstrucao, double area, String localizacao) {
        this.anoConstrucao = anoConstrucao;
        this.area = area;
        this.localizacao = localizacao;
    }

    /**
     * Obtém o ano de construção do imóvel.
     * @return O ano de construção do imóvel.
     */
    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * Define o ano de construção do imóvel.
     * @param anoConstrucao O ano de construção do imóvel.
     */
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    /**
     * Obtém a área do imóvel.
     * @return A área do imóvel.
     */
    public double getArea() {
        return area;
    }

    /**
     * Define a área do imóvel.
     * @param area A área do imóvel.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Obtém a localização do imóvel.
     * @return A localização do imóvel.
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Define a localização do imóvel.
     * @param localizacao A localização do imóvel.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
