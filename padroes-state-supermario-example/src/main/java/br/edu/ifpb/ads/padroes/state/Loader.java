package br.edu.ifpb.ads.padroes.state;

import br.edu.ifpb.ads.padroes.state.model.Mario;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Loader {

    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.pegarCogumelo();
        mario.pegarPena();
        mario.levarDano();
        mario.pegarFlor();
        mario.pegarFlor();
        mario.levarDano();
        mario.levarDano();
        mario.pegarPena();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
    }
}
