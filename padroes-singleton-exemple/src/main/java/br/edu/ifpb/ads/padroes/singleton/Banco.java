package br.edu.ifpb.ads.padroes.singleton;

/**
 *
 * @author diogomoreira
 */
public class Banco {

    private static Banco banco;
    private String nome;
    private Long totalEmCaixa;

    private Banco() {
        totalEmCaixa = 50000L;
    }

    public void sacar(Long valor) {
        totalEmCaixa -= valor;
    }

    public void depositar(Long valor) {
        totalEmCaixa += valor;
    }

    public static Banco getInstance() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    public Long getTotalEmCaixa() {
        return totalEmCaixa;
    }

}
