package br.edu.ifpb.ads.padroes.strategy.strategies;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;

/**
 * 
 * @author diogomoreira
 */
public interface EntregaStrategy {

    BigDecimal calcularFrete(Pedido pedido);

}
