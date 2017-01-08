package br.edu.ifpb.ads.padroes.observer;

import java.util.Scanner;

import br.edu.ifpb.padroes.observer.listeners.MotoTaxi;
import br.edu.ifpb.padroes.observer.listeners.Taxi;
import br.edu.ifpb.padroes.observer.model.Central;
import br.edu.ifpb.padroes.observer.model.Chamada;

/**
 * Esta classe é responsável por inicializar a aplicação.
 *
 * @author diogomoreira
 */
public class Loader {

    public static void main(String[] args) {
        Central centralTaxi = new Central();

        Taxi taxi1 = new Taxi("Palio", "MNO1792", "Sr. Fulano");
        centralTaxi.addObserver(taxi1);

        Taxi taxi2 = new Taxi("Voyage", "NPZ8932", "Sr. Cicrano");
        centralTaxi.addObserver(taxi2);

        MotoTaxi taxi3 = new MotoTaxi("Fulano", "HAS1278");
        centralTaxi.addObserver(taxi3);

        centralTaxi.addChamada(new Chamada("Rua Tabeliao Antonio Holanda"));
    }

}
