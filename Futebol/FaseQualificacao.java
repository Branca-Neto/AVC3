/**
 * Classe para representar a fase de qualificação do campeonato.
 */
public class FaseQualificacao {
    private Equipa[] equipas;
    private Jogo[] jogos;
    // Outras informações relevantes

    /**
     * Construtor da classe FaseQualificacao.
     * @param equipas Um array de equipas participantes na fase de qualificação.
     * @param jogos Um array de jogos da fase de qualificação.
     */
    public FaseQualificacao(Equipa[] equipas, Jogo[] jogos) {
        this.equipas = equipas;
        this.jogos = jogos;
    }

    /**
     * Método para recuperar as equipas participantes na fase de qualificação.
     * @return Um array de equipas participantes.
     */
    public Equipa[] getEquipas() {
        return equipas;
    }

    /**
     * Método para definir as equipas participantes na fase de qualificação.
     * @param equipas Um array de equipas participantes.
     */
    public void setEquipas(Equipa[] equipas) {
        this.equipas = equipas;
    }

    /**
     * Método para recuperar os jogos da fase de qualificação.
     * @return Um array de jogos da fase de qualificação.
     */
    public Jogo[] getJogos() {
        return jogos;
    }

    /**
     * Método para definir os jogos da fase de qualificação.
     * @param jogos Um array de jogos da fase de qualificação.
     */
    public void setJogos(Jogo[] jogos) {
        this.jogos = jogos;
    }
}
