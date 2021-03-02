package it.iad.listaSpesaUnoServer.controller;

import it.iad.listaSpesaUnoServer.model.Prodotto;
import it.iad.listaSpesaUnoServer.service.Servizio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ControllerProdotto {

    @Autowired
    private Servizio servizio;

    @RequestMapping("/aggiungi")
    public void addProdotto(@RequestBody Prodotto dtoProdotto) {
        System.out.println("Sono nel Controller Aggiungi prodotto");
        servizio.addProdotto(dtoProdotto.getNome());
    }
     @RequestMapping("/elimina-tutto")
    public void deleteAll() {
        System.out.println("Sono nel controllo Elimina tutti i campi");
        servizio.deleteAll();
    }
}
