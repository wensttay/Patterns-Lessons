package br.edu.ifpb.ads.padroes.command.aparelhos;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class TV {

    private boolean ligado = false;

    public void ligarTV() {
        this.ligado = true;
    }

    public void desligarTV() {
        this.ligado = false;
    }

}
