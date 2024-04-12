/**
 * A classe Jardineiro representa um funcionário responsável pela jardinagem em um condomínio.
 * Esta classe herda da classe Funcionario e possui os atributos e métodos específicos de um jardineiro.
 */
public class Jardineiro extends Funcionario { 
    
    /**
     * Construtor da classe Jardineiro.
     * @param nome O nome do jardineiro.
     * @param telefone O número de telefone do jardineiro.
     * @param identificador O identificador do jardineiro.
     */
    public Jardineiro(String nome, int telefone, int identificador){
        super(identificador, nome, telefone); // Chama o construtor da classe pai (Funcionario)
    }
}
