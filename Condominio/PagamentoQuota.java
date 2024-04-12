/**
 * A interface PagamentoQuota define o contrato para calcular as quotas a serem pagas pelos condóminos.
 */
public interface PagamentoQuota {
    
    /**
     * Calcula o valor das quotas a serem pagas com base no valor das despesas comuns.
     * @param despesas O valor total das despesas comuns do condomínio.
     * @return O valor das quotas a serem pagas pelo condómino.
     */
    public double calcularQuotas(double despesas);
    
}