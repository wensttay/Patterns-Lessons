package br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Janela;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class JanelaWindows extends Janela {

    @Override
    public void desenharJanela() {
        System.out.println("Janela Windows");
    }

}
