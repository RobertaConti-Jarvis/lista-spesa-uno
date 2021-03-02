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
    public void addProdotto(String nome) {
        Prodotto prodotto = new Prodotto(nome);
        prodottoRepository.save(prodotto);
        System.out.println("Nuovo prodotto Aggiunto");
    }

    @Override
    public void deleteAll() {
        prodottoRepository.deleteAllInBatch();
        System.out.println("Nuovo prodotto Aggiunto");
    }

//    @Override
//    public void prodotto() {
//        personaRepository.deleteAllInBatch();
//        Persona p = new Persona("Mario", "Rossi", LocalDate.now());
//
//        List<Persona> lista = personaRepository.findAll();
//        System.out.println(lista);
//        System.out.println("---------------");
//        lista.forEach(q -> System.out.println(q));
//        System.out.println("---------------");
//        for (Persona per : lista) {
//            System.out.println(per);
//        }
//    }
}
