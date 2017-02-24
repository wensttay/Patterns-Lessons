package br.edu.ifpb.ads.padroes.state;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public interface LivroState {

    LivroState emprestar();

    LivroState devolver();

    LivroState reservar();

}
