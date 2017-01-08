package br.edu.ifpb.ads.padroes.strategy.strategies;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;

/**
 *
 * @author diogomoreira
 */
public class MotoboyStrategy implements EntregaStrategy {

    public BigDecimal calcularFrete(Pedido pedido) {
        return new BigDecimal("15");
    }

}
