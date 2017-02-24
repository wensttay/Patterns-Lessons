package br.edu.ifpb.ads.padroes.command.aparelhos;

import java.util.Date;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class SistemaDeSom {

    private int volume;

    public void ligar(Date date) {
        System.out.println("O aparelho irá ligar às " + date);
    }

    public void desligar(Date date) {
        System.out.println("O aparelho irá desligar às " + date);
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

}
