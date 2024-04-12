import java.util.Arrays;

/**
 * A classe GestaoImobiliaria representa o sistema de gestão de uma imobiliária,
 * onde são armazenadas informações sobre clientes, pedidos de registro de proprietários,
 * funcionários, vendas realizadas e imóveis disponíveis.
 */
public class GestaoImobiliaria {
    private Cliente[] clientes; // Array para armazenar clientes
    private Cliente[] pedidosRegistoProprietarios; // Array para armazenar pedidos de registro de proprietários
    private Funcionario[] funcionarios; // Array para armazenar funcionários
    private Venda[] vendasRealizadas; // Array para armazenar vendas realizadas
    private Imovel[] imoveisDisponiveis; // Array para armazenar imóveis disponíveis
    private int numClientes; // Número atual de clientes
    private int numPedidosRegistoProprietarios; // Número atual de pedidos de registro de proprietários
    private int numFuncionarios; // Número atual de funcionários
    private int numVendasRealizadas; // Número atual de vendas realizadas
    private int numImoveisDisponiveis; // Número atual de imóveis disponíveis

    /**
     * Construtor da classe GestaoImobiliaria.
     * @param maxClientes O número máximo de clientes que podem ser armazenados.
     * @param maxPedidosRegistoProprietarios O número máximo de pedidos de registro de proprietários que podem ser armazenados.
     * @param maxFuncionarios O número máximo de funcionários que podem ser armazenados.
     * @param maxVendasRealizadas O número máximo de vendas realizadas que podem ser armazenadas.
     * @param maxImoveisDisponiveis O número máximo de imóveis disponíveis que podem ser armazenados.
     */
    public GestaoImobiliaria(int maxClientes, int maxPedidosRegistoProprietarios, int maxFuncionarios, int maxVendasRealizadas, int maxImoveisDisponiveis) {
        clientes = new Cliente[maxClientes];
        pedidosRegistoProprietarios = new Cliente[maxPedidosRegistoProprietarios];
        funcionarios = new Funcionario[maxFuncionarios];
        vendasRealizadas = new Venda[maxVendasRealizadas];
        imoveisDisponiveis = new Imovel[maxImoveisDisponiveis];
        numClientes = 0;
        numPedidosRegistoProprietarios = 0;
        numFuncionarios = 0;
        numVendasRealizadas = 0;
        numImoveisDisponiveis = 0;
    }

    /**
     * Adiciona um cliente ao sistema.
     * @param cliente O cliente a ser adicionado.
     */
    public void adicionarCliente(Cliente cliente) {
        clientes[numClientes++] = cliente;
    }

    /**
     * Retorna uma cópia do array de clientes.
     * @return Uma cópia do array de clientes.
     */
    public Cliente[] obterClientes() {
        return Arrays.copyOf(clientes, numClientes);
    }

    /**
     * Adiciona um pedido de registro de proprietário ao sistema.
     * @param proprietario O pedido de registro de proprietário a ser adicionado.
     */
    public void adicionarPedidoRegistoProprietario(Cliente proprietario) {
        pedidosRegistoProprietarios[numPedidosRegistoProprietarios++] = proprietario;
    }

    /**
     * Retorna uma cópia do array de pedidos de registro de proprietários.
     * @return Uma cópia do array de pedidos de registro de proprietários.
     */
    public Cliente[] obterPedidosRegistoProprietarios() {
        return Arrays.copyOf(pedidosRegistoProprietarios, numPedidosRegistoProprietarios);
    }

    /**
     * Adiciona um funcionário ao sistema.
     * @param funcionario O funcionário a ser adicionado.
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios[numFuncionarios++] = funcionario;
    }

    /**
     * Retorna uma cópia do array de funcionários.
     * @return Uma cópia do array de funcionários.
     */
    public Funcionario[] obterFuncionarios() {
        return Arrays.copyOf(funcionarios, numFuncionarios);
    }

    /**
     * Adiciona uma venda realizada ao sistema.
     * @param venda A venda realizada a ser adicionada.
     */
    public void adicionarVenda(Venda venda) {
        vendasRealizadas[numVendasRealizadas++] = venda;
    }

    /**
     * Retorna uma cópia do array de vendas realizadas.
     * @return Uma cópia do array de vendas realizadas.
     */
    public Venda[] obterVendasRealizadas() {
        return Arrays.copyOf(vendasRealizadas, numVendasRealizadas);
    }

    /**
     * Adiciona um imóvel disponível ao sistema.
     * @param imovel O imóvel disponível a ser adicionado.
     */
    public void adicionarImovel(Imovel imovel) {
        imoveisDisponiveis[numImoveisDisponiveis++] = imovel;
    }

    /**
     * Retorna uma cópia do array de imóveis disponíveis.
     * @return Uma cópia do array de imóveis disponíveis.
     */
    public Imovel[] obterImoveisDisponiveis() {
        return Arrays.copyOf(imoveisDisponiveis, numImoveisDisponiveis);
    }

    // Outros métodos necessários para a gestão do sistema

    /**
     * Método principal que permite interagir com o sistema de gestão imobiliária.
     * @param args Os argumentos da linha de comando (não utilizados neste momento).
     */
    public static void main(String[] args) {
        // código para interagir com o sistema de gestão imobiliária
         // Criando um objeto para interagir com o teclado
         Scanner scanner = new Scanner(System.in);
        
         // Criando um objeto da classe GestaoImobiliaria
         GestaoImobiliaria gestaoImobiliaria = new GestaoImobiliaria(50, 50, 50, 50, 50);
         
         // Exibindo o menu de opções
         exibirMenu(scanner, gestaoImobiliaria);
         
         // Fechando o scanner
         scanner.close();
     }
     
     /**
      * Exibe o menu de opções para o usuário e solicita uma escolha.
      * @param scanner O objeto Scanner para entrada de dados.
      * @param gestaoImobiliaria O objeto GestaoImobiliaria para realizar operações.
      */
     public static void exibirMenu(Scanner scanner, GestaoImobiliaria gestaoImobiliaria) {
         int opcao;
         do {
             System.out.println("Menu de Opções:");
             System.out.println("1. Adicionar Cliente");
             System.out.println("2. Adicionar Pedido de Registro de Proprietário");
             System.out.println("3. Adicionar Funcionário");
             System.out.println("4. Adicionar Venda Realizada");
             System.out.println("5. Adicionar Imóvel Disponível");
             System.out.println("0. Sair");
             System.out.print("Escolha uma opção: ");
             
             opcao = scanner.nextInt();
             scanner.nextLine(); // Limpar o buffer
             
             // Realizar a ação de acordo com a opção escolhida
             switch (opcao) {
                 case 1:
                     // Adicionar cliente
                     adicionarCliente(scanner, gestaoImobiliaria);
                     break;
                 case 2:
                     // Adicionar pedido de registro de proprietário
                     adicionarPedidoRegistroProprietario(scanner, gestaoImobiliaria);
                     break;
                 case 3:
                     // Adicionar funcionário
                     adicionarFuncionario(scanner, gestaoImobiliaria);
                     break;
                 case 4:
                     // Adicionar venda realizada
                     adicionarVendaRealizada(scanner, gestaoImobiliaria);
                     break;
                 case 5:
                     // Adicionar imóvel disponível
                     adicionarImovelDisponivel(scanner, gestaoImobiliaria);
                     break;
                 case 0:
                     System.out.println("Saindo...");
                     break;
                 default:
                     System.out.println("Opção inválida! Por favor, escolha novamente.");
             }
         } while (opcao != 0);
     }
     
     
    
}
