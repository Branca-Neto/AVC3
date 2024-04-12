/**
 * Classe para representar um jogador de futebol.
 */
public class Jogador {
    private String nome;
    private int numero;
    private String posicao;

    /**
     * Construtor da classe Jogador.
     * @param nome O nome do jogador.
     * @param numero O número da camisola do jogador.
     * @param posicao A posição em que o jogador joga.
     */
    public Jogador(String nome, int numero, String posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    /**
     * Método para obter o nome do jogador.
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do jogador.
     * @param nome O nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o número da camisola do jogador.
     * @return O número da camisola do jogador.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método para definir o número da camisola do jogador.
     * @param numero O número da camisola do jogador.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método para obter a posição em que o jogador joga.
     * @return A posição do jogador.
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * Método para definir a posição em que o jogador joga.
     * @param posicao A posição do jogador.
     */
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
