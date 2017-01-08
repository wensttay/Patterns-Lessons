package br.edu.ifpb.ads.padroes.command;

import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Invocador {

    private List<Comando> ligar = new LinkedList<Comando>();
    private List<Comando> desligar = new LinkedList<Comando>();

    public Invocador() {

    }

    public void addComandoLigar(Comando comando) {
        this.ligar.add(comando);
    }

    public void addComandoDesligar(Comando comando) {
        this.desligar.add(comando);
    }

    public void ligar() {
        executeAll(ligar);
    }

    public void desligar() {
        executeAll(desligar);
    }

    private void executeAll(List<Comando> comandos) {
        for (Comando comando : comandos) {
            comando.execute();
        }
    }

}
