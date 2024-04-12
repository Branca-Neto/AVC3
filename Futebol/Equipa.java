
/**
 * Classe para representar uma equipa de futebol (seleção).
 */
public class Equipa {
    private String nome;
    private Jogador[] jogadores;
    private int numJogadores;

    /**
     * Construtor da classe Equipa.
     * @param nome O nome da equipa.
     * @param tamanhoMaximo O tamanho máximo da equipa.
     */
    public Equipa(String nome, int tamanhoMaximo) {
        this.nome = nome;
        this.jogadores = new Jogador[tamanhoMaximo];
        this.numJogadores = 0;
    }

    /**
     * Método para adicionar um jogador à equipa.
     * @param jogador O jogador a ser adicionado à equipa.
     */
    public void adicionarJogador(Jogador jogador) {
        if (numJogadores < jogadores.length) {
            jogadores[numJogadores] = jogador;
            numJogadores++;
        } else {
            System.out.println("A equipa já está completa. Não é possível adicionar mais jogadores.");
        }
    }

    /**
     * Método para recuperar a lista de jogadores da equipa.
     * @return A lista de jogadores da equipa.
     */
    public Jogador[] getJogadores() {
        return jogadores;
    }

    /**
     * Método para recuperar o nome da equipa.
     * @return O nome da equipa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da equipa.
     * @param nome O nome da equipa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
