/**
 * A classe GestoraCondominio representa uma empresa responsável pela gestão de condomínios.
 * Esta classe estende a classe Empresa e herda todos os seus atributos e métodos.
 */
public class GestoraCondominio extends Empresa {
    
    /**
     * Construtor da classe GestoraCondominio.
     * @param nome O nome da empresa.
     * @param NIF O número de identificação fiscal da empresa.
     * @param localizacao A localização da empresa.
     * @param telefone O número de telefone da empresa.
     * @param email O endereço de email da empresa.
     */
    public GestoraCondominio(String nome, String NIF, String localizacao, int telefone, String email){
       super(nome, NIF, localizacao, telefone, email); // Chama o construtor da classe pai (Empresa)
    }
    
}
