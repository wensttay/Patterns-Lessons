package br.edu.ifpb.ads.padroes.command.aparelhos;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class CondicionadorDeAr {

    private boolean ligado = false;
    private int temperatura;

    public void ligar(int temperatura) {
        this.ligado = true;
        this.temperatura = temperatura;
    }

    public void desligar() {
        this.ligado = false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

}
