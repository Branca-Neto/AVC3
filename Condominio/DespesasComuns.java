/**
 * A classe DespesasComuns representa as despesas comuns de um condomínio, contendo informações como tipo de despesa, valor, data de vencimento e empresa responsável pela despesa.
 */
public class DespesasComuns {
    
    private String tipoDespesa; // O tipo de despesa
    private int valor; // O valor da despesa
    private String dataVencimento; // A data de vencimento da despesa
    private Empresa empresa; // A empresa responsável pela despesa

    /**
     * Construtor padrão da classe DespesasComuns.
     */
    public DespesasComuns(){}

    /**
     * Construtor da classe DespesasComuns.
     * @param tipo O tipo de despesa.
     * @param valor O valor da despesa.
     * @param data A data de vencimento da despesa.
     * @param empresa A empresa responsável pela despesa.
     */
    public DespesasComuns(String tipo, int valor, String data, Empresa empresa){
        this.tipoDespesa = tipo;
        this.valor = valor;
        this.dataVencimento = data;
        this.empresa = empresa;     
    }

    /**
     * Obtém a empresa responsável pela despesa.
     * @return A empresa responsável pela despesa.
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Define a empresa responsável pela despesa.
     * @param empresa A empresa responsável pela despesa.
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    /**
     * Obtém o tipo de despesa.
     * @return O tipo de despesa.
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o tipo de despesa.
     * @param tipoDespesa O tipo de despesa.
     */
    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    /**
     * Obtém o valor da despesa.
     * @return O valor da despesa.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Define o valor da despesa.
     * @param valor O valor da despesa.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtém a data de vencimento da despesa.
     * @return A data de vencimento da despesa.
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define a data de vencimento da despesa.
     * @param dataVencimento A data de vencimento da despesa.
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * Retorna uma representação em string do objeto DespesasComuns.
     * @return Uma representação em string do objeto DespesasComuns.
     */
    @Override
    public String toString() {
        return "DespesasComuns{" + "tipoDespesa=" + tipoDespesa + ", valor=" + valor + ", dataVencimento=" + dataVencimento + '}';
    }
}
