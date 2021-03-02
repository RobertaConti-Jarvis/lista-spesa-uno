package it.iad.listaSpesaUnoServer.service.impl;

import it.iad.listaSpesaUnoServer.model.Prodotto;
import it.iad.listaSpesaUnoServer.repository.ProdottoRepository;
import it.iad.listaSpesaUnoServer.service.Servizio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpProdotto implements Servizio {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public String addProdotto(String nome) {
        Prodotto prodotto = new Prodotto(nome);
        prodottoRepository.save(prodotto);
        System.out.println("Nuovo prodotto Aggiunto");
        return "Prodotto Inserito";
    }

    @Override
    public String deleteAll() {
        prodottoRepository.deleteAllInBatch();
        System.out.println("Lista Cancellata");
        return "Lista Cancellata";
    }

}
