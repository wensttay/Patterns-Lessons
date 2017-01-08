package br.edu.ifpb.ads.padroes.abstractfactory;

import br.edu.ifpb.ads.padroes.abstractfactory.produtos.BarraRolagem;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Botao;
import br.edu.ifpb.ads.padroes.abstractfactory.produtos.Janela;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Loader {

    public static void main(String[] args) {
        AbstractProdutoFactory factory = new WindowsProdutoFactory();
        BarraRolagem barraRolagem = factory.criarBarraRolagem();
        Botao botao = factory.criarBotao();
        Janela janela = factory.criarJanela();
    }

}
