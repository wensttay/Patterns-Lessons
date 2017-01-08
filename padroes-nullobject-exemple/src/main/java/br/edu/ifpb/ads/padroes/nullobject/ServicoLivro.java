package br.edu.ifpb.ads.padroes.nullobject;

import java.util.List;

/**
 *
 * @author diogomoreira
 */
public class ServicoLivro {

    private LivroDAO dao;

    public ServicoLivro() {
        this.dao = new LivroDAO();
    }

    public void devolverLivro(String isbn) {
        Livro livro = this.dao.recuperarLivro(isbn);
        livro.devolver();
    }

    public List<Livro> recuperarLivros() {
        return this.dao.recuperarTodos();
    }

}
