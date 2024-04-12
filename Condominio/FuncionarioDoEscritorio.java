/**
 * A classe FuncionarioDoEscritorio representa um funcionário do escritório de uma empresa.
 * Esta classe estende a classe Funcionario e herda todos os seus atributos e métodos.
 */
public class FuncionarioDoEscritorio extends Funcionario {
    
    private String cargo; // O cargo do funcionário do escritório
    
    /**
     * Construtor padrão da classe FuncionarioDoEscritorio.
     */
    public FuncionarioDoEscritorio(){}
    
    /**
     * Construtor da classe FuncionarioDoEscritorio.
     * @param id O identificador único do funcionário.
     * @param nome O nome do funcionário.
     * @param telefone O número de telefone do funcionário.
     * @param idade A idade do funcionário.
     * @param endereco O endereço do funcionário.
     * @param cargo O cargo do funcionário do escritório.
     */
    public FuncionarioDoEscritorio(int id,  String nome, int telefone, int idade, String endereco, String cargo){
        super(id, nome, telefone, idade, endereco); // Chama o construtor da classe pai (Funcionario)
        this.cargo = cargo;
    }

    /**
     * Obtém o cargo do funcionário do escritório.
     * @return O cargo do funcionário do escritório.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário do escritório.
     * @param cargo O cargo do funcionário do escritório.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
