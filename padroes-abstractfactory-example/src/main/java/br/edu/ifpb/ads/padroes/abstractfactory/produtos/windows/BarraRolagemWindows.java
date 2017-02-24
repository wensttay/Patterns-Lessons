package br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.BarraRolagem;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class BarraRolagemWindows extends BarraRolagem {

    @Override
    public void desenharBarraRolagem() {
        System.out.println("Barra de Rolagem Windows");
    }

}
