package br.edu.ifpb.ads.padroes.state;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class LivroReservado implements LivroState {

    public LivroState emprestar() {
        System.out.println("Livro emprestado!");
        return new LivroEmprestado();
    }

    public LivroState devolver() {
        System.out.println("Livro retirado da reserva!");
        return new LivroDisponivel();
    }

    public LivroState reservar() {
        System.out.println("Livro já reservado!");
        return this;
    }

}
