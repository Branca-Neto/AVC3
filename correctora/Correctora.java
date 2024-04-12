/**
 * A classe Correctora implementa um sistema de gestão de empresas, clientes, títulos e transações financeiras.
 * Ela permite registrar novas empresas, clientes, títulos, bem como criar ordens de compra e venda, e listar informações relevantes.
 */
public class Correctora {

  /**
   * O método principal que inicia o programa e exibe o menu de opções.
   * @param args Os argumentos de linha de comando (não são usados neste programa).
   */
  public static void main(String[] args) {
      
      Empresa[] empresas = new Empresa[50];
      int qtdEmpresas = 0;
      
      Cliente[] clientes = new Cliente[50];
      int qtdClientes = 0;
      
      Funcionario[] funcionarios = new Funcionario[50];
      int qtdFuncionarios = 0;
      
      Titulo cotacoes[] = new Titulo[50];
       
      int qtdCotacoes = 0;
      
      Scanner entrada = new Scanner(System.in);
      
      int opcao;
      do {
          
          System.out.println("Menu de Opções\n"
              + "1 - Registrar uma nova empresa\n"
              + "2-  Lista de Empresas\n"
              + "3 -Registrar Cliente\n"
              + "4 - Listar Clientes\n"
              + "6 - Registrar Cotacao de Um Titulo\n"
              + "7 - Registrar Corrector\n"
              + "8 - Listar Correctores\n"
              + "9 - Registrar Novos Títulos na Bolsa\n"  
              + "10 -Listar Títulos Disponíveis e Suas Cotações\n"
              + "11 - Criar uma ordem de compra\n"
              + "12 - Criar uma ordem de venda\n"
              + "13- Listar Ordens de Compra e Venda\n"
              + "14- Listar Cotações");
          
          System.out.println("Escolha uma opção");
          opcao = entrada.nextInt();    
          
          switch(opcao){
          
              case  1 -> registrarNovaEmpresa();
              
              case 2 -> listarEmpresas();
              
              case 3 -> registrarNovoCliente();
              
              case 4 -> listarClientes();
              
              case 5 -> registrarNovoCliente();
              
              case 6 -> registrarCotacaoTitulo();
              
              case 7 -> registrarCorrector();
              
              case 8 -> listarCorrectores();
              
              case 9 -> registrarNovosTitulos();
              
              case 10 -> listarTitulosDisponiveis();
              
              case 11 -> criarOrdemCompra();
              
              case 12 -> criarOrdemVenda();
              
              case 13 -> listarOrdensCompraVenda();
              
              case 14 -> listarCotacoes();
              
              default -> System.out.println("Opção inválida !!!!!!!");
          }
      
      } while(opcao != 0);
  }
  
  /**
   * Registra uma nova empresa no sistema.
   */
  private static void registrarNovaEmpresa() {
      // Implementação para registrar uma nova empresa
  }
  
  /**
   * Lista todas as empresas registradas no sistema.
   */
  private static void listarEmpresas() {
      // Implementação para listar as empresas
  }
  
  /**
   * Registra um novo cliente no sistema.
   */
  private static void registrarNovoCliente() {
      // Implementação para registrar um novo cliente
  }
  
  /**
   * Lista todos os clientes registrados no sistema.
   */
  private static void listarClientes() {
      // Implementação para listar os clientes
  }
  
  /**
   * Registra a cotação de um título no sistema.
   */
  private static void registrarCotacaoTitulo() {
      // Implementação para registrar a cotação de um título
  }
  
  /**
   * Registra um novo corrector no sistema.
   */
  private static void registrarCorrector() {
      // Implementação para registrar um corrector
  }
  
  /**
   * Lista todos os correctores registrados no sistema.
   */
  private static void listarCorrectores() {
      // Implementação para listar os correctores
  }
  
  /**
   * Registra novos títulos na bolsa.
   */
  private static void registrarNovosTitulos() {
      // Implementação para registrar novos títulos
  }
  
  /**
   * Lista os títulos disponíveis e suas cotações.
   */
  private static void listarTitulosDisponiveis() {
      // Implementação para listar os títulos disponíveis e suas cotações
  }
  
  /**
   * Cria uma ordem de compra no sistema.
   */
  private static void criarOrdemCompra() {
      // Implementação para criar uma ordem de compra
  }
  
  /**
   * Cria uma ordem de venda no sistema.
   */
  private static void criarOrdemVenda() {
      // Implementação para criar uma ordem de venda
  }
  
  /**
   * Lista as ordens de compra e venda registradas no sistema.
   */
  private static void listarOrdensCompraVenda() {
      // Implementação para listar as ordens de compra e venda
  }
  
  /**
   * Lista todas as cotações registradas no sistema.
   */
  private static void listarCotacoes() {
      // Implementação para listar as cotações
  }
}
