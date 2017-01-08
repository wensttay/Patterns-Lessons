package br.edu.ifpb.ads.padroes.templatemethod;

import java.time.LocalDateTime;

/**
 * Esta classe define o modelo do algoritmo, deixando algumas partes variáveis,
 * que serão definidas pelas classes concretas. Observe os métodos
 * {@link #definirIntroducao()} e {@link #definirCorpo()} e suas respectivas
 * implementações na classe {@link DocumentoImpl}
 *
 * @author diogomoreira
 */
public abstract class DocumentoTemplate {

    private String autor;

    public DocumentoTemplate(String autor) {
        this.autor = autor;
    }

    public void imprimir() {
        StringBuffer buffer = new StringBuffer();

        // Cabeçalho
        buffer.append("INSTITUTO FEDERAL DA PARAÍBA");
        buffer.append("\n");
        buffer.append("============================");
        buffer.append("\n");

        buffer.append(this.autor);

        buffer.append("\n");
        buffer.append("INTRODUÇÃO");
        buffer.append("\n");
        buffer.append("============================");
        buffer.append("\n");
        buffer.append(definirIntroducao());
        buffer.append("\n");

        buffer.append("\n");
        buffer.append("TEXTO");
        buffer.append("\n");
        buffer.append("============================");
        buffer.append("\n");
        buffer.append(definirCorpo());
        buffer.append("\n");
        buffer.append("\n");

        // Rodapé
        buffer.append(LocalDateTime.now().getYear());
        System.out.println(buffer.toString());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    protected abstract String definirIntroducao();

    protected abstract String definirCorpo();

}
