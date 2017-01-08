package br.edu.ifpb.ads.padroes.strategy;

import br.edu.ifpb.ads.padroes.strategy.model.Pedido;
import br.edu.ifpb.ads.padroes.strategy.strategies.PACStrategy;

/**
 *
 * @author diogomoreira
 */
public class Loader {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setPeso(13D);

        pedido.setStrategy(new PACStrategy());
        System.out.println(pedido.calcularFrete());
    }

}
