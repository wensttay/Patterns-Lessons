package br.edu.ifpb.ads.padroes.singleton;

/**
 * Classe que faz etc etc.
 *
 * Para criar um objeto desta classe, utilize {@link #criarUsuario()}
 *
 * @author diogomoreira
 */
public class Usuario {

    private String nome;
    private String login;
    private String senha;

    private static Usuario usuario;

    private Usuario() {
    }

    /**
     * Método para retornar a instância única da classe {@link Usuario}. Esse
     * método utiliza <i>Lazy Loading</i> para instanciar o objeto apenas no
     * momento em que for necessária
     *
     * @return
     */
    public static Usuario criarUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

}
