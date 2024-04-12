import java.util.Scanner;

public class CampeonatoEuropeuFutebol {
    
    private String paisOrganizador;
    private String[] estadios;
    private String[] cidades;
    private FaseQualificacao[] fasesQualificacao;
    
    public CampeonatoEuropeuFutebol(String paisOrganizador, String[] estadios, String[] cidades, FaseQualificacao[] fasesQualificacao) {
        this.paisOrganizador = paisOrganizador;
        this.estadios = estadios;
        this.cidades = cidades;
        this.fasesQualificacao = fasesQualificacao;
    }

    public String getPaisOrganizador() {
        return paisOrganizador;
    }
    
    public String[] getEstadios() {
        return estadios;
    }
    
    public String[] getCidades() {
        return cidades;
    }
    
    public FaseQualificacao[] getFasesQualificacao() {
        return fasesQualificacao;
    }

    public static void main(String[] args) {
        // Criando instância do scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Dados fictícios do campeonato
        String paisOrganizador = "País X";
        String[] estadios = {"Estádio A", "Estádio B", "Estádio C"};
        String[] cidades = {"Cidade A", "Cidade B", "Cidade C"};
        FaseQualificacao[] fasesQualificacao = {new FaseQualificacao(...), new FaseQualificacao(...), ...};
        
        // Criando instância do campeonato
        CampeonatoEuropeuFutebol euro2024 = new CampeonatoEuropeuFutebol(paisOrganizador, estadios, cidades, fasesQualificacao);
        
        int opcao;
        do {
            // Exibindo menu
            System.out.println("\nMenu do Campeonato Europeu de Futebol");
            System.out.println("1 - Exibir informações sobre o país organizador");
            System.out.println("2 - Exibir lista de estádios");
            System.out.println("3 - Exibir lista de cidades dos estádios");
            System.out.println("4 - Exibir fases de qualificação");
            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            // Processando opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    System.out.println("País Organizador: " + euro2024.getPaisOrganizador());
                    break;
                case 2:
                    System.out.println("Estádios:");
                    for (String estadio : euro2024.getEstadios()) {
                        System.out.println("- " + estadio);
                    }
                    break;
                case 3:
                    System.out.println("Cidades:");
                    for (String cidade : euro2024.getCidades()) {
                        System.out.println("- " + cidade);
                    }
                    break;
                case 4:
                    System.out.println("Fases de Qualificação:");
                    for (FaseQualificacao fase : euro2024.getFasesQualificacao()) {
                        System.out.println("- " + fase);
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
        
        // Fechando o scanner
        scanner.close();
    }
}
