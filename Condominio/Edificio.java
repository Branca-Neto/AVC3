/**
 * A classe Edificio representa um edifício que contém apartamentos.
 */
public class Edificio {
    

    private int quarteirao; // O número do quarteirão onde o edifício está localizado
    private int numero; // O número do edifício
    Apartamento [] apartamentos; // Um array de objetos Apartamento que representam os apartamentos no edifício
    int qtdApartamentos = 0; // A quantidade de apartamentos no edifício

    /**
     * Construtor padrão da classe Edificio.
     */
    public Edificio(){}

    /**
     * Construtor da classe Edificio.
     * @param quarteirao O número do quarteirão onde o edifício está localizado.
     * @param numero O número do edifício.
     * @param nApartamentos O número total de apartamentos no edifício.
     */
    public Edificio(int quarteirao, int numero, int nApartamentos){
        this.quarteirao = quarteirao;
        this.numero = numero;
        this.apartamentos = new Apartamento[nApartamentos];
    }
    
    /**
     * Adiciona um novo apartamento ao edifício.
     * @param apt O objeto Apartamento a ser adicionado.
     */
    public void adicionarApartamento(Apartamento apt){
        this.apartamentos[qtdApartamentos++] = apt;
    }

    /**
     * Obtém o número do quarteirão onde o edifício está localizado.
     * @return O número do quarteirão.
     */
    public int getQuarteirao() {
        return quarteirao;
    }

    /**
     * Define o número do quarteirão onde o edifício está localizado.
     * @param quarteirao O número do quarteirão.
     */
    public void setQuarteirao(int quarteirao) {
        this.quarteirao = quarteirao;
    }

    /**
     * Obtém o número do edifício.
     * @return O número do edifício.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do edifício.
     * @param numero O número do edifício.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém a quantidade de apartamentos no edifício.
     * @return A quantidade de apartamentos.
     */
    public int getQtdApartamentos() {
        return qtdApartamentos;
    }
       
    /**
     * Obtém a lista de apartamentos no edifício.
     */
    public void getApartamentos(){
        for(int i = 0; i < this.getQtdApartamentos(); i++) 
            System.out.println("Lista de Apartamentos: \n" + this.apartamentos[i].toString());
    }    
}
