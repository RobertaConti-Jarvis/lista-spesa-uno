package it.iad.listaspesaunoserver.service.impl;

import it.iad.listaspesaunoserver.model.Prodotto;
import it.iad.listaspesaunoserver.repository.ProdottoRepository;
import it.iad.listaspesaunoserver.service.Servizio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpProdotto implements Servizio {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public List<Prodotto> addProdotto(String nome) {
        Prodotto prodotto = new Prodotto(nome);
        prodottoRepository.save(prodotto);
        System.out.println("Nuovo prodotto Aggiunto");
        return selectAll();
    }

    @Override
    public List<Prodotto> delete(Long id) {
        prodottoRepository.deleteById(id);
        System.out.println("Prodotto Cancellato");
        return selectAll();
    }

    @Override
    public List<Prodotto> deleteAll() {
        prodottoRepository.deleteAllInBatch();
        System.out.println("Lista Cancellata");
        return selectAll();
    }

    @Override
    public List<Prodotto> selectAll() {
        System.out.println("DB letto");
        return prodottoRepository.findAll();

    }
}
