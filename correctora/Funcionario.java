/**
 * Classe para representar um funcionário.
 */
public class Funcionario {
    
    private String bilhete; // Número do bilhete de identidade do funcionário
    private String nome; // Nome do funcionário
    private String dataAdmissao; // Data de admissão do funcionário
    private String dataRescisao; // Data de rescisão do contrato do funcionário (se aplicável)
    private String telefone; // Número de telefone do funcionário
    private double salarioBase; // Salário base do funcionário
    
    /**
     * Construtor da classe Funcionario.
     * @param bilhete Número do bilhete de identidade do funcionário
     * @param nome Nome do funcionário
     * @param dataAdm Data de admissão do funcionário
     * @param dataRes Data de rescisão do contrato do funcionário (se aplicável)
     * @param telefone Número de telefone do funcionário
     * @param salario Salário base do funcionário
     */
    public Funcionario(String bilhete, String nome, String dataAdm, String dataRes,  String telefone, double salario){
        this.bilhete = bilhete;
        this.nome= nome;
        this.dataAdmissao= dataAdm;
        this.dataRescisao= dataRes;
        this.telefone= telefone;
        this.salarioBase= salario;
    }
    
    // Getters e setters para os atributos da classe
    
    /**
     * Obtém o número do bilhete de identidade do funcionário.
     * @return Número do bilhete de identidade
     */
    public String getBilhete(){
       return bilhete;     
   }
   
    /**
     * Define o número do bilhete de identidade do funcionário.
     * @param bilhete Número do bilhete de identidade
     */
    public void setBilhete(String bilhete){
        this.bilhete = bilhete;
    }
     
    /**
     * Obtém o nome do funcionário.
     * @return Nome do funcionário
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Define o nome do funcionário.
     * @param nome Nome do funcionário
     */
    public void setNome(String nome){
        this.nome= nome;
    }
    
    /**
     * Obtém a data de admissão do funcionário.
     * @return Data de admissão do funcionário
     */
    public String getDataAdmissao(){
        return dataAdmissao;
    }
    
    /**
     * Define a data de admissão do funcionário.
     * @param dataAdm Data de admissão do funcionário
     */
    public void setDataAdmissao(String dataAdm){
        this.dataAdmissao= dataAdm;
    }
    
    /**
     * Obtém a data de rescisão do contrato do funcionário.
     * @return Data de rescisão do contrato do funcionário
     */
    public String getDataRescisao(){
        return dataRescisao;
    }
    
    /**
     * Define a data de rescisão do contrato do funcionário.
     * @param dataRes Data de rescisão do contrato do funcionário
     */
    public void setDataRescisao(String dataRes){
        this.dataRescisao= dataRes;
    }
    
    /**
     * Obtém o número de telefone do funcionário.
     * @return Número de telefone do funcionário
     */
    public String getTelefone(){
        return telefone;
    }
    
    /**
     * Define o número de telefone do funcionário.
     * @param telefone Número de telefone do funcionário
     */
    public void setTelefone(String telefone){
        this.telefone= telefone;
    }

    /**
     * Obtém o salário base do funcionário.
     * @return Salário base do funcionário
     */
    public double getSalarioBase(){
        return salarioBase;
    }
    
    /**
     * Define o salário base do funcionário.
     * @param salario Salário base do funcionário
     */
    public void setSalarioBase(double salario){
        this.salarioBase=salario;
    }
}
