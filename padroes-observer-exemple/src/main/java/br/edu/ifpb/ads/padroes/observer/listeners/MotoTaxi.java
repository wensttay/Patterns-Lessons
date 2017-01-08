package br.edu.ifpb.ads.padroes.observer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.edu.ifpb.padroes.observer.Observer;
import br.edu.ifpb.padroes.observer.model.Chamada;

/**
 *
 * @author diogomoreira
 */
public class MotoTaxi implements Observer<Chamada> {

    private final Logger logger = LoggerFactory.getLogger(MotoTaxi.class);

    private String nomeTaxista;
    private String placa;

    @Override
    public void update(Chamada object) {
        logger.info("Chamada recebida! Local: " + object.getLocal());
        logger.info("Moto-Taxista " + nomeTaxista + " | Placa: " + placa);
    }

    public MotoTaxi(String nomeTaxista, String placa) {
        this.nomeTaxista = nomeTaxista;
        this.placa = placa;
    }

    public String getNomeTaxista() {
        return nomeTaxista;
    }

    public void setNomeTaxista(String nomeTaxista) {
        this.nomeTaxista = nomeTaxista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Logger getLogger() {
        return logger;
    }

}
