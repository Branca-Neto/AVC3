/**
 * A classe Funcionario representa um funcionário de uma imobiliária, com código único, nome, agência
 * onde trabalha e salário mensal.
 */
public class Funcionario {
    private int codigo; // O código único do funcionário
    private String nome; // O nome do funcionário
    private String agencia; // A agência onde o funcionário trabalha
    private double salarioMensal; // O salário mensal do funcionário

    /**
     * Construtor da classe Funcionario.
     * @param codigo O código único do funcionário.
     * @param nome O nome do funcionário.
     * @param agencia A agência onde o funcionário trabalha.
     * @param salarioMensal O salário mensal do funcionário.
     */
    public Funcionario(int codigo, String nome, String agencia, double salarioMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.agencia = agencia;
        this.salarioMensal = salarioMensal;
    }

    /**
     * Obtém o código único do funcionário.
     * @return O código único do funcionário.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código único do funcionário.
     * @param codigo O código único do funcionário.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o nome do funcionário.
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     * @param nome O nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a agência onde o funcionário trabalha.
     * @return A agência onde o funcionário trabalha.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência onde o funcionário trabalha.
     * @param agencia A agência onde o funcionário trabalha.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém o salário mensal do funcionário.
     * @return O salário mensal do funcionário.
     */
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * Define o salário mensal do funcionário.
     * @param salarioMensal O salário mensal do funcionário.
     */
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
