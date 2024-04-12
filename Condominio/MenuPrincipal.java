import java.util.Scanner;
public class MenuPrincipal {


     /**
  * Método principal que exibe um menu de opções e permite interagir com o sistema.
       */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdCondo, qtdPrest, qtdApartamentos, qtdCondominos;
        qtdCondo = qtdPrest = qtdApartamentos = qtdCondominos = 0;

        // Condomínios e Condomínos
        Condominio[] condominios = new Condominio[50];

        Condomino[] condominos = new Condomino[50];

        //Empresas
        GestoraCondominio[] empresasGestoras = new GestoraCondominio[50];
        PrestadoraServico[] empresasPrestadoras = new PrestadoraServico[50];
        
        //Funcionarios
        FuncionarioDoEscritorio[] funcEscritorios = new FuncionarioDoEscritorio[50];
        Jardineiro[] jardineiros = new Jardineiro[5];
            
        do {
            System.out.println("Menu de opções\n"
            + "1 - Adicionar um novo Condomínio\n"
            + "2 - Adicionar Edíficio a um Condomínio\n"
            + "3 - Ver Condomínios Existentes\n"
            + "4 - Adicionar Empresa de Prestação de Serviços\n"
            + "5 - Ver Empresas de Prestação de Serviços\n"
            + "6 - Adicionar um Novo Condomino\n"
            + "7 - Adicionar uma nova despesa ao condomínio\n"
            + "8 - Relatórios dos Condomínios\n"
            + "9 - Adicionar um novo apartamento a um edifício\n"
            + "10 - Adicionar Apartamento a um edificio\n"
            + "11 - Listar Apartamentos Existentes\n"
            + "12 - Listar Empresas Prestadoras de Serviços\n"
            + "0 - Sair do Programa\n");
        
            System.out.println("Escolha uma opção:");
            opcao = entrada.nextInt();
        
            switch (opcao) {
                case 1 -> adicionarCondominio();
                case 2 -> adicionarEdificio();
                case 3 -> verCondominios();
                case 4 -> adicionarEmpresaPrestadora();
                case 5 -> verEmpresasPrestadoras();
                case 6 -> adicionarCondomino();
                case 7 -> adicionarDespesaCondominio();
                case 8 -> relatoriosCondominios();
                case 9 -> adicionarApartamento();
                case 10 -> adicionarApartamentoEdificio();
                case 11 -> listarApartamentos();
                case 12 -> listarEmpresasPrestadoras();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("\nOpção Inválida!!!\n");
            }
        
        } while (opcao != 0);
        
            entrada.close();
    }
    // Métodos para realizar as opções do menu
        
    private static void adicionarCondominio() {
        // Implementar a lógica para adicionar um novo condomínio
    }
        
    private static void adicionarEdificio() {
        // Implementar a lógica para adicionar um edifício a um condomínio existente
    }
        
    private static void verCondominios() {
        // Implementar a lógica para visualizar os condomínios existentes
    }
        
    private static void adicionarEmpresaPrestadora() {
        // Implementar a lógica para adicionar uma empresa prestadora de serviços
    }
        
    private static void verEmpresasPrestadoras() {
        // Implementar a lógica para visualizar as empresas prestadoras de serviços
    }
        
    private static void adicionarCondomino() {
        // Implementar a lógica para adicionar um novo condômino
    }
        
    private static void adicionarDespesaCondominio() {
        // Implementar a lógica para adicionar uma nova despesa ao condomínio
    }
        
    private static void relatoriosCondominios() {
        // Implementar a lógica para gerar relatórios dos condomínios
    }
        
    private static void adicionarApartamento() {
        // Implementar a lógica para adicionar um novo apartamento a um edifício
    }
        
    private static void adicionarApartamentoEdificio() {
        // Implementar a lógica para adicionar um apartamento a um edifício existente
    }
        
    private static void listarApartamentos() {
        // Implementar a lógica para listar os apartamentos existentes
    }
        
    private static void listarEmpresasPrestadoras() {
        // Implementar a lógica para listar as empresas prestadoras de serviços
    }
}
        