package br.edu.ifpb.ads.padroes.state;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Livro {

    private LivroState estado;

    public Livro() {
        this.estado = new LivroDisponivel();
    }

    public void emprestar() {
        this.estado = estado.emprestar();
    }

    public void devolver() {
        this.estado = estado.devolver();
    }

    public void reservar() {
        this.estado = estado.reservar();
    }

}
