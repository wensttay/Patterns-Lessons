package br.edu.ifpb.ads.padroes.observer;

/**
 * Interface que deve ser implementada por todos os observadores para os tipos
 * {@link Observable}.
 *
 * @author diogo.moreira
 * @see Observable
 */
public interface Observer<T> {

    void update(T object);

}
