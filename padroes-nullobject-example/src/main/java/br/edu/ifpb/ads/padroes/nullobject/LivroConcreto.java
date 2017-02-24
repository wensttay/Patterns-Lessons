package br.edu.ifpb.ads.padroes.nullobject;

/**
 *
 * @author diogomoreira
 */
public class LivroConcreto implements Livro {

    private Long id;
    private String nome;
    private String isbn;
    private boolean emprestado;

    public LivroConcreto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public void emprestar() {
        this.emprestado = true;
    }

}
