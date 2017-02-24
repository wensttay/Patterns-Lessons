package br.edu.ifpb.ads.padroes.builder.usuario;

/**
 * Para construir um objeto de Usuário, utilize {@link UsuarioBuilder}
 *
 * @author diogo.moreira
 * @see UsuarioBuilder
 */
public final class Usuario {

    private final String nome;      // Obrigatório
    private final String sobrenome; // Obrigatório
    private final Integer idade;    // Opcional
    private final String telefone;  // Opcional
    private final String endereco;  // Opcional

    protected Usuario(String nome, String sobrenome, Integer idade, String telefone, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", sobrenome=" + sobrenome
                + ", idade=" + idade + ", telefone=" + telefone + ", endereco="
                + endereco + "]";
    }

}
