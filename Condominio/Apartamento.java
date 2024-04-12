/**
 * A classe Apartamento representa uma unidade habitacional dentro de um edifício, contendo informações como número, tipologia, edifício e condômino.
 */
public class Apartamento {
    
    private int numero; // O número do apartamento
    private String tipologia; // A tipologia do apartamento
    private Edificio edificio; // O edifício ao qual o apartamento pertence
    private Condomino condomino; // O condômino que reside no apartamento
    
    /**
     * Construtor padrão da classe Apartamento.
     */
    public Apartamento() {}
    
    /**
     * Construtor da classe Apartamento.
     * @param edificio O edifício ao qual o apartamento pertence.
     * @param tipologia A tipologia do apartamento.
     * @param numero O número do apartamento.
     * @param condomino O condômino que reside no apartamento.
     */
    public Apartamento(Edificio edificio, String tipologia, int numero, Condomino condomino) {
        this.condomino = condomino;
        this.edificio = edificio;
        this.tipologia = tipologia;
        this.numero = numero;
    }
    
    /**
     * Define o condômino que reside no apartamento.
     * @param condomino O condômino que reside no apartamento.
     */
    public void setCondomino(Condomino condomino) {
        this.condomino = condomino;
    }
    
    /**
     * Obtém o condômino que reside no apartamento.
     * @return O condômino que reside no apartamento.
     */
    public Condomino getCondomino() {
        return this.condomino;
    }
    
    /**
     * Define a tipologia do apartamento.
     * @param tipologia A tipologia do apartamento.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    
    /**
     * Obtém a tipologia do apartamento.
     * @return A tipologia do apartamento.
     */
    public String getTipologia() {
        return this.tipologia;
    }

    /**
     * Obtém o número do apartamento.
     * @return O número do apartamento.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do apartamento.
     * @param numero O número do apartamento.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém o edifício ao qual o apartamento pertence.
     * @return O edifício ao qual o apartamento pertence.
     */
    public Edificio getEdificio() {
        return edificio;
    }

    /**
     * Define o edifício ao qual o apartamento pertence.
     * @param edificio O edifício ao qual o apartamento pertence.
     */
    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}
