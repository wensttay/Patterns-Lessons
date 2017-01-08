package br.edu.ifpb.ads.padroes.command.comandos;

import br.edu.ifpb.ads.padroes.command.Comando;
import br.edu.ifpb.ads.padroes.command.aparelhos.TV;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class DesligarTV implements Comando {

    private TV tv;

    public DesligarTV(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.desligarTV();
    }

}
