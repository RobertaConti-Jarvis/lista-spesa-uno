package it.iad.listaSpesaUnoServer.service;

import it.iad.listaSpesaUnoServer.model.Prodotto;
import java.util.List;

public interface Servizio {

    List<Prodotto> addProdotto(String nome);

    List<Prodotto> deleteAll();
    
    List<Prodotto> selectAll();
}
