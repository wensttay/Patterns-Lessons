package br.edu.ifpb.ads.padroes.abstractfactory;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.BarraRolagem;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Botao;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Janela;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public abstract class AbstractProdutoFactory {

    abstract Botao criarBotao();

    abstract Janela criarJanela();

    abstract BarraRolagem criarBarraRolagem();
}
