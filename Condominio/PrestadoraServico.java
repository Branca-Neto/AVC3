/**
 * A classe PrestadoraServico representa uma empresa que oferece serviços diversos.
 * Esta classe herda da classe Empresa e adiciona um atributo específico para o tipo de serviço prestado.
 */
public class PrestadoraServico extends Empresa {
    
    /** O tipo de serviço oferecido pela prestadora de serviço. */
    private String tipoServico;
    
    /**
     * Construtor da classe PrestadoraServico.
     * @param nome O nome da empresa prestadora de serviço.
     * @param NIF O número de identificação fiscal (NIF) da empresa.
     * @param localizacao A localização da empresa.
     * @param telefone O número de telefone da empresa.
     * @param email O endereço de email da empresa.
     * @param tipoServico O tipo de serviço oferecido pela empresa.
     */
    public PrestadoraServico(String nome, String NIF, String localizacao, int telefone, String email, String tipoServico){
        super(nome, NIF, localizacao, telefone, email); // Chama o construtor da classe pai (Empresa)
        this.tipoServico = tipoServico;
    }

    /**
     * Obtém o tipo de serviço oferecido pela prestadora de serviço.
     * @return O tipo de serviço oferecido.
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * Define o tipo de serviço oferecido pela prestadora de serviço.
     * @param tipoServico O tipo de serviço a ser definido.
     */
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * Retorna uma representação em string da prestadora de serviço, incluindo todas as informações relevantes.
     * @return Uma string representando a prestadora de serviço.
     */
    @Override
    public String toString() {
        return "Prestadoras Serviço{" + "\ntipoServico:\n" + tipoServico + "\nNome da Empresa:" + super.getNome() + 
                "\nNIF:" + super.getNIF() +
                 "\nEmail:" + super.getEmail() +
                "\nTelefone:" + super.getTelefone() +
                "\nEnedereço:" + super.getLocalizacao() +'}';
    }
       
}
