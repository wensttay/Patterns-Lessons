package br.edu.ifpb.ads.padroes.strategy.strategies;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;

/**
 *
 * @author diogomoreira
 */
public class SedexStrategy implements EntregaStrategy {

    public BigDecimal calcularFrete(Pedido pedido) {
        BigDecimal fixo = new BigDecimal("50");
        BigDecimal adicional = new BigDecimal(pedido.getPeso()).multiply(new BigDecimal("2.50"));
        return fixo.add(adicional);
    }

}
