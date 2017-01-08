package br.edu.ifpb.ads.padroes.observer.model;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.edu.ifpb.padroes.observer.Observable;
import br.edu.ifpb.padroes.observer.Observer;

/**
 *
 * @author diogomoreira
 */
public class Central implements Observable<Chamada> {

    private List<Observer<Chamada>> observadores;
    private final Logger logger = LoggerFactory.getLogger(Central.class);

    public Central() {
        this.observadores = new LinkedList<Observer<Chamada>>();
    }

    @Override
    public void addObserver(Observer newObserver) {
        this.observadores.add(newObserver);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observadores.remove(observer);
    }

    public void addChamada(Chamada chamada) {
        notifyObservers(chamada);
    }

    @Override
    public void notifyObservers(Chamada object) {
        for (Observer observer : observadores) {
            logger.warn("Notificando o observador " + observer);
            observer.update(object);
        }
    }

}
