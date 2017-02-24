package br.edu.ifpb.ads.padroes.state;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class LivroEmprestado implements LivroState {

    public LivroState emprestar() {
        System.out.println("Já está emprestado!");
        return this;
    }

    public LivroState devolver() {
        System.out.println("Livro devolvido!");
        return new LivroDisponivel();
    }

    public LivroState reservar() {
        System.out.println("Não é possivel reservar!");
        return this;
    }

}
