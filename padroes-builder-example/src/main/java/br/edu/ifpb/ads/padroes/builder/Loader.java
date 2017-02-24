package br.edu.ifpb.ads.padroes.builder;

import br.edu.ifpb.ads.padroes.builder.usuario.Usuario;
import br.edu.ifpb.ads.padroes.builder.usuario.UsuarioBuilder;

/**
 *
 * @author diogo.moreira
 * @see Usuario
 * @see UsuarioBuilder
 */
public class Loader {

    public static void main(String[] args) {
        Usuario usuario = new UsuarioBuilder("Diogo", "Moreira")
                .comIdade(27).comTelefone("749844556").buildUsuario();
    }

}
