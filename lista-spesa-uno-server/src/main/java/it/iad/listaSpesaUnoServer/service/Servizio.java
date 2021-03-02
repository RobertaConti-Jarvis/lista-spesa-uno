package it.iad.listaSpesaUnoServer.service;

import it.iad.listaSpesaUnoServer.model.Prodotto;
import java.util.List;

public interface Servizio {

    String addProdotto(String nome);

    String deleteAll();
    
    List<Prodotto> selectAll();
}
