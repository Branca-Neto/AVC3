/**
 * A classe Condomino representa um morador de um condomínio.
 * Contém informações sobre o nome, telefone, email e saldo do morador, além de métodos para cálculo de quotas de condomínio.
 */
public class Condomino implements PagamentoQuota {
    
    private String nome; // O nome do condômino
    private int telefone; // O telefone do condômino
    private String email; // O email do condômino
    private final double taxaCondominio = 0.015; // A taxa de condomínio fixa, expressa como uma porcentagem
    private int saldo; // O saldo do condômino
    private double valorPorPagar; // O valor a ser pago pelo condômino
    
    /**
     * Construtor da classe Condomino.
     * @param nome O nome do condômino.
     * @param telefone O telefone do condômino.
     * @param email O email do condômino.
     */
    public Condomino(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Obtém o nome do condômino.
     * @return O nome do condômino.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condômino.
     * @param nome O nome do condômino.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o telefone do condômino.
     * @return O telefone do condômino.
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do condômino.
     * @param telefone O telefone do condômino.
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email do condômino.
     * @return O email do condômino.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do condômino.
     * @param email O email do condômino.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém a taxa de condomínio do condômino.
     * @return A taxa de condomínio do condômino.
     */
    public double getTaxaCondominio() {
        return taxaCondominio;
    }

    /**
     * Obtém o saldo do condômino.
     * @return O saldo do condômino.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo do condômino.
     * @param saldo O saldo do condômino.
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtém o valor a ser pago pelo condômino.
     * @return O valor a ser pago pelo condômino.
     */
    public double getValorPorPagar() {
        return valorPorPagar;
    }

    /**
     * Define o valor a ser pago pelo condômino.
     * @param valorPorPagar O valor a ser pago pelo condômino.
     */
    public void setValorPorPagar(double valorPorPagar) {
        this.valorPorPagar = valorPorPagar;
    }
    

    /**
     * Calcula o valor das quotas de condomínio a serem pagas pelo condômino.
     * @param despesas O total das despesas do condomínio.
     * @return O valor a ser pago pelo condômino.
     */
    @Override
    public double calcularQuotas(double despesas) {
        valorPorPagar = despesas * taxaCondominio;
        return valorPorPagar;
    }

    /**
     * Retorna uma representação em string do objeto Condomino.
     * @return Uma representação em string do objeto Condomino.
     */
    @Override
    public String toString() {
        return "Condomino{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", taxaCondominio=" + taxaCondominio + ", valorPorPagar=" + valorPorPagar + '}';
    }
}
