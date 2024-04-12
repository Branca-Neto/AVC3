/**
 * Classe para representar um título financeiro.
 */
public class Titulo {
    
    private String dataEmissao; // Data de emissão do título
    private double valorFacial; // Valor facial do título
    private String designacao; // Designação do título
    private Titulo[] titulos; // Array de títulos
    private Empresa empresa; // Empresa associada ao título
    
    /**
     * Construtor para a classe Titulo.
     * @param data A data de emissão do título.
     * @param valor O valor facial do título.
     * @param designacao A designação do título.
     * @param emp A empresa associada ao título.
     */
    public Titulo(String data, double valor, String designacao, Empresa emp){
        this.dataEmissao = data;
        this.valorFacial = valor;
        this.designacao = designacao;
        this.empresa = emp;
        
        this.titulos = new Titulo[2000];
    }

    /**
     * Obtém a data de emissão do título.
     * @return A data de emissão do título.
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define a data de emissão do título.
     * @param dataEmissao A data de emissão a ser definida.
     */
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * Obtém o valor facial do título.
     * @return O valor facial do título.
     */
    public double getValorFacial() {
        return valorFacial;
    }

    /**
     * Define o valor facial do título.
     * @param valorFacial O valor facial a ser definido.
     */
    public void setValorFacial(double valorFacial) {
        this.valorFacial = valorFacial;
    }

    /**
     * Obtém a designação do título.
     * @return A designação do título.
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Define a designação do título.
     * @param designacao A designação a ser definida.
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    
    /**
     * Obtém a empresa associada ao título.
     * @return A empresa associada ao título.
     */
    public Empresa getEmpresa(){
        return empresa;
    }
    
    /**
     * Define a empresa associada ao título.
     * @param emp A empresa a ser definida.
     */
    public void setEmpresa(Empresa emp){
        this.empresa = emp;
    }
    
    /**
     * Obtém uma representação em string do título.
     * @return Uma representação em string do título.
     */
    @Override
    public String toString() {
        return "Titulo{" + "dataEmissao=" + dataEmissao + ", valorFacial=" + valorFacial + ", designacao=" + designacao + ", titulos=" + titulos + ", empresa=" + empresa + '}';
    }
}
