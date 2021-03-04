package it.iad.listaspesaunoserver.controller;

import it.iad.listaspesaunoserver.dto.ContenutoDbDto;
import it.iad.listaspesaunoserver.model.Prodotto;
import it.iad.listaspesaunoserver.service.Servizio;
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

    @RequestMapping("/elimina")
    public ContenutoDbDto delete(@RequestBody Prodotto dtoProdotto) {
        System.out.println("Sono nel delete() ");
        return new ContenutoDbDto(servizio.delete(dtoProdotto.getId()));
    }

    @RequestMapping("/elimina-tutto")
    public ContenutoDbDto deleteAll() {
        System.out.println("Sono nel deleteAll() ");
        return new ContenutoDbDto(servizio.deleteAll());
    }

    @RequestMapping("/carica-dati-da-visualizzare")
    public ContenutoDbDto selectAll() {
        System.out.println("Sono nel selectAll() ");
        return new ContenutoDbDto(servizio.selectAll());
    }
}
