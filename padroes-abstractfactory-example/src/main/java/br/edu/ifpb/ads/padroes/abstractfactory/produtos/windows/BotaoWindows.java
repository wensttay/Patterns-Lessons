package br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Botao;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class BotaoWindows extends Botao {

    @Override
    public void desenharBotao() {
        System.out.println("Botão Windows");
    }

}
