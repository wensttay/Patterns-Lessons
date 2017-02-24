package br.edu.ifpb.ads.padroes.command;

import br.edu.ifpb.ads.padroes.command.aparelhos.TV;
import br.edu.ifpb.ads.padroes.command.comandos.DesligarTV;
import br.edu.ifpb.ads.padroes.command.comandos.LigarTV;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Loader {

    public static void main(String[] args) {
        Invocador casaAutomatizada = new Invocador();
        TV tv = new TV();
        casaAutomatizada.addComandoLigar(new LigarTV(tv));
        casaAutomatizada.addComandoDesligar(new DesligarTV(tv));
    }

}
