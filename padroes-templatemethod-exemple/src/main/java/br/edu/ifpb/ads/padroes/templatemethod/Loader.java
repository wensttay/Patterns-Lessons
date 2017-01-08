package br.edu.ifpb.ads.padroes.templatemethod;

/**
 * Classe que utiliza o modelo e define sua variação do algoritmo
 * 
 * @author diogomoreira
 */
public class Loader {

    public static void main(String[] args) {
        DocumentoTemplate d = new DocumentoImpl("Diogo Moreira");
        d.imprimir();
    }

}
