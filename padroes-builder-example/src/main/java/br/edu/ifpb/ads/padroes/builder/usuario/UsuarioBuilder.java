package br.edu.ifpb.ads.padroes.builder.usuario;

/**
 *
 * @author diogo.moreira
 */
public final class UsuarioBuilder {

    private final String nome;      // Obrigat�rio
    private final String sobrenome; // Obrigat�rio
    private Integer idade;    // Opcional
    private String telefone;  // Opcional
    private String endereco;  // Opcional

    public UsuarioBuilder(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public UsuarioBuilder comIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public UsuarioBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public UsuarioBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario buildUsuario() {
        return new Usuario(this.nome, this.sobrenome, this.idade, this.telefone, this.endereco);
    }

}
