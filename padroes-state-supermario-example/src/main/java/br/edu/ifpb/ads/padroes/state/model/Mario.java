package br.edu.ifpb.ads.padroes.state.model;

import br.edu.ifpb.ads.padroes.state.states.MarioPequeno;
import br.edu.ifpb.ads.padroes.state.states.MarioState;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Mario {

    protected MarioState estado;

    public Mario() {
        estado = new MarioPequeno();
    }

    public void pegarCogumelo() {
        estado = estado.pegarCogumelo();
    }

    public void pegarFlor() {
        estado = estado.pegarFlor();
    }

    public void pegarPena() {
        estado = estado.pegarPena();
    }

    public void levarDano() {
        estado = estado.levarDano();
    }

    public String estadoAtual() {
        return this.estado.estadoAtual();
    }
}
