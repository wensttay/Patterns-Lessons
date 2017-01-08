package br.edu.ifpb.ads.padroes.nullobject;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author diogomoreira
 */
public class LivroDAO {

    public Livro recuperarLivro(String isbn) {
        return new LivroNull();
    }

    public List<Livro> recuperarTodos() {
        return Collections.EMPTY_LIST;
    }

}
