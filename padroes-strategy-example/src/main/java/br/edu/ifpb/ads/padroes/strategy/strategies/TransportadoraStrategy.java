package br.edu.ifpb.ads.padroes.strategy.strategies;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;

/**
 *
 * @author diogomoreira
 */
public class TransportadoraStrategy implements EntregaStrategy {

    public BigDecimal calcularFrete(Pedido pedido) {
        BigDecimal fixo = new BigDecimal("35");
        BigDecimal adicional = new BigDecimal(pedido.getPeso()).multiply(new BigDecimal("4"));
        return fixo.add(adicional);
    }

}
