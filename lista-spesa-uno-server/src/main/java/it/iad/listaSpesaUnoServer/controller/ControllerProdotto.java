package it.iad.listaSpesaUnoServer.controller;

import it.iad.listaSpesaUnoServer.Dto.ContenutoDbDto;
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
    public ContenutoDbDto addProdotto(@RequestBody Prodotto dtoProdotto) {
        System.out.println("Sono nel addProdotto()");
        return new ContenutoDbDto(servizio.addProdotto(dtoProdotto.getNome()));
    }

    @RequestMapping("/elimina-tutto")
    public ContenutoDbDto deleteAll() {
        System.out.println("Sono nel deleteAll() ");
        return new ContenutoDbDto(servizio.selectAll());

    }

    @RequestMapping("/carica-dati-da-visualizzare")
    public ContenutoDbDto selectAll() {
        System.out.println("Sono nel selectAll() ");
        return new ContenutoDbDto(servizio.selectAll());

    }
}
