package br.edu.ifpb.ads.padroes.strategy.model;

import java.math.BigDecimal;

import br.edu.ifpb.ads.padroes.strategy.strategies.EntregaStrategy;

/**
 *
 * @author diogomoreira
 */
public class Pedido implements Comparable<Pedido> {

    private double peso;
    private EntregaStrategy strategy;

    public Pedido() {

    }

    public Pedido(double peso, EntregaStrategy strategy) {
        this.peso = peso;
        this.strategy = strategy;
    }

    public BigDecimal calcularFrete() {
        return this.strategy.calcularFrete(this);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setStrategy(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public int compareTo(Pedido o) {
        return this.calcularFrete().compareTo(o.calcularFrete());
    }

}
