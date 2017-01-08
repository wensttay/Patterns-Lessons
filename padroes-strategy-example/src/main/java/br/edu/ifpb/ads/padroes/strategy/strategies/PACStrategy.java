package br.edu.ifpb.ads.padroes.strategy.strategies;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;

/**
 *
 * @author diogomoreira
 */
public class PACStrategy implements EntregaStrategy {

    public BigDecimal calcularFrete(Pedido pedido) {
        if (pedido.getPeso() < 1) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal("15");
        }
    }

}
