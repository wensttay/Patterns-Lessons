package br.edu.ifpb.ads.padroes.observer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.edu.ifpb.padroes.observer.Observer;
import br.edu.ifpb.padroes.observer.model.Chamada;

/**
 *
 * @author diogomoreira
 */
public class Taxi implements Observer<Chamada> {

    private final Logger logger = LoggerFactory.getLogger(Taxi.class);

    private String modeloCarro;
    private String placa;
    private String nomeMotorista;

    @Override
    public void update(Chamada object) {
        logger.info("Chamada recebida! Local: " + object.getLocal());
        logger.info("Taxista " + nomeMotorista + " | Modelo: " + modeloCarro + " | Placa: " + placa);
    }

    public Taxi(String modeloCarro, String placa, String nomeMotorista) {
        this.modeloCarro = modeloCarro;
        this.placa = placa;
        this.nomeMotorista = nomeMotorista;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

}
