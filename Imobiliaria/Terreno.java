/**
 * A classe Terreno é uma subclasse de Imovel e representa um tipo específico de imóvel,
 * caracterizado pela informação sobre se está localizado em zona urbana ou não.
 */
public class Terreno extends Imovel {
    private boolean zonaUrbana; // Indica se o terreno está em zona urbana

    /**
     * Construtor da classe Terreno.
     * @param anoConstrucao O ano de construção do terreno.
     * @param area A área do terreno.
     * @param localizacao A localização do terreno.
     * @param zonaUrbana Indica se o terreno está em zona urbana.
     */
    public Terreno(int anoConstrucao, double area, String localizacao, boolean zonaUrbana) {
        super(anoConstrucao, area, localizacao);
        this.zonaUrbana = zonaUrbana;
    }

    /**
     * Verifica se o terreno está em zona urbana.
     * @return true se o terreno está em zona urbana, false caso contrário.
     */
    public boolean isZonaUrbana() {
        return zonaUrbana;
    }

    /**
     * Define se o terreno está em zona urbana ou não.
     * @param zonaUrbana true se o terreno está em zona urbana, false caso contrário.
     */
    public void setZonaUrbana(boolean zonaUrbana) {
        this.zonaUrbana = zonaUrbana;
    }
}
