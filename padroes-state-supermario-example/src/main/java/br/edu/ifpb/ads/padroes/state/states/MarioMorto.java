package br.edu.ifpb.ads.padroes.state.states;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class MarioMorto implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return null;
    }

    @Override
    public MarioState pegarFlor() {
        return null;
    }

    @Override
    public MarioState pegarPena() {
        return null;
    }

    @Override
    public MarioState levarDano() {
        return null;
    }

    @Override
    public String estadoAtual() {
        return "Morto";
    }

}
