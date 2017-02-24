package br.edu.ifpb.ads.padroes.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author diogomoreira
 */
public class BancoTest {

    @Test
    public void testeSacar() {
        Banco b = Banco.getInstance();
        b.sacar(500L);
        assertEquals(new Long(49500L), b.getTotalEmCaixa());
    }

    @Test
    public void testeDepositar() {
        Banco b = Banco.getInstance();
        b.depositar(500L);
        assertEquals(new Long(50500L), b.getTotalEmCaixa());
    }

}
