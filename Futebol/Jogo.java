/**
 * Classe para representar um jogo de futebol.
 */
public class Jogo {
    private Equipa equipaCasa;
    private Equipa equipaVisitante;
    private int golosEquipaCasa;
    private int golosEquipaVisitante;
    // Outras estatísticas do jogo

    /**
     * Construtor da classe Jogo.
     * @param equipaCasa A equipa que joga em casa.
     * @param equipaVisitante A equipa que joga como visitante.
     * @param golosEquipaCasa O número de golos marcados pela equipa da casa.
     * @param golosEquipaVisitante O número de golos marcados pela equipa visitante.
     */
    public Jogo(Equipa equipaCasa, Equipa equipaVisitante, int golosEquipaCasa, int golosEquipaVisitante) {
        this.equipaCasa = equipaCasa;
        this.equipaVisitante = equipaVisitante;
        this.golosEquipaCasa = golosEquipaCasa;
        this.golosEquipaVisitante = golosEquipaVisitante;
    }

    /**
     * Método para recuperar a equipa da casa.
     * @return A equipa que joga em casa.
     */
    public Equipa getEquipaCasa() {
        return equipaCasa;
    }

    /**
     * Método para definir a equipa da casa.
     * @param equipaCasa A equipa que joga em casa.
     */
    public void setEquipaCasa(Equipa equipaCasa) {
        this.equipaCasa = equipaCasa;
    }

    /**
     * Método para recuperar a equipa visitante.
     * @return A equipa que joga como visitante.
     */
    public Equipa getEquipaVisitante() {
        return equipaVisitante;
    }

    /**
     * Método para definir a equipa visitante.
     * @param equipaVisitante A equipa que joga como visitante.
     */
    public void setEquipaVisitante(Equipa equipaVisitante) {
        this.equipaVisitante = equipaVisitante;
    }

    /**
     * Método para recuperar o número de golos marcados pela equipa da casa.
     * @return O número de golos marcados pela equipa da casa.
     */
    public int getGolosEquipaCasa() {
        return golosEquipaCasa;
    }

    /**
     * Método para definir o número de golos marcados pela equipa da casa.
     * @param golosEquipaCasa O número de golos marcados pela equipa da casa.
     */
    public void setGolosEquipaCasa(int golosEquipaCasa) {
        this.golosEquipaCasa = golosEquipaCasa;
    }

    /**
     * Método para recuperar o número de golos marcados pela equipa visitante.
     * @return O número de golos marcados pela equipa visitante.
     */
    public int getGolosEquipaVisitante() {
        return golosEquipaVisitante;
    }

    /**
     * Método para definir o número de golos marcados pela equipa visitante.
     * @param golosEquipaVisitante O número de golos marcados pela equipa visitante.
     */
    public void setGolosEquipaVisitante(int golosEquipaVisitante) {
        this.golosEquipaVisitante = golosEquipaVisitante;
    }
}
