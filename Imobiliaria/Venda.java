/**
 * A classe Venda representa uma transação de venda de um imóvel realizada por uma agência imobiliária,
 * contendo informações como a agência responsável, a data da venda, o vendedor, o imóvel vendido,
 * o cliente comprador e o proprietário do imóvel.
 */
public class Venda {
    private String agencia; // A agência responsável pela venda
    private String data; // A data da venda
    private Funcionario vendedor; // O funcionário responsável pela venda
    private Imovel imovel; // O imóvel vendido
    private Cliente clienteComprador; // O cliente que comprou o imóvel
    private Cliente proprietario; // O proprietário do imóvel vendido

    /**
     * Construtor da classe Venda.
     * @param agencia A agência responsável pela venda.
     * @param data A data da venda.
     * @param vendedor O funcionário responsável pela venda.
     * @param imovel O imóvel vendido.
     * @param clienteComprador O cliente que comprou o imóvel.
     * @param proprietario O proprietário do imóvel vendido.
     */
    public Venda(String agencia, String data, Funcionario vendedor, Imovel imovel, Cliente clienteComprador, Cliente proprietario) {
        this.agencia = agencia;
        this.data = data;
        this.vendedor = vendedor;
        this.imovel = imovel;
        this.clienteComprador = clienteComprador;
        this.proprietario = proprietario;
    }

    /**
     * Obtém a agência responsável pela venda.
     * @return A agência responsável pela venda.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência responsável pela venda.
     * @param agencia A agência responsável pela venda.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém a data da venda.
     * @return A data da venda.
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data da venda.
     * @param data A data da venda.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém o funcionário responsável pela venda.
     * @return O funcionário responsável pela venda.
     */
    public Funcionario getVendedor() {
        return vendedor;
    }

    /**
     * Define o funcionário responsável pela venda.
     * @param vendedor O funcionário responsável pela venda.
     */
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Obtém o imóvel vendido.
     * @return O imóvel vendido.
     */
    public Imovel getImovel() {
        return imovel;
    }

    /**
     * Define o imóvel vendido.
     * @param imovel O imóvel vendido.
     */
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    /**
     * Obtém o cliente que comprou o imóvel.
     * @return O cliente que comprou o imóvel.
     */
    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    /**
     * Define o cliente que comprou o imóvel.
     * @param clienteComprador O cliente que comprou o imóvel.
     */
    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    /**
     * Obtém o proprietário do imóvel vendido.
     * @return O proprietário do imóvel vendido.
     */
    public Cliente getProprietario() {
        return proprietario;
    }

    /**
     * Define o proprietário do imóvel vendido.
     * @param proprietario O proprietário do imóvel vendido.
     */
    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }
}
