package br.edu.ifpb.ads.padroes.abstractfactory;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.BarraRolagem;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Botao;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Janela;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows.BarraRolagemWindows;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows.BotaoWindows;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.windows.JanelaWindows;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class WindowsProdutoFactory extends AbstractProdutoFactory {

    @Override
    Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    Janela criarJanela() {
        return new JanelaWindows();
    }

    @Override
    BarraRolagem criarBarraRolagem() {
        return new BarraRolagemWindows();
    }

}
