package br.edu.ifpb.ads.padroes.state;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Loader {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.emprestar();
        livro.devolver();
        livro.reservar();
        livro.devolver();
        livro.devolver();
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.reservar();
    }

}
