package it.iad.listaspesaunoserver.service;

import it.iad.listaspesaunoserver.model.Prodotto;
import java.util.List;

public interface Servizio {

    List<Prodotto> addProdotto(String nome);
    
    List<Prodotto> delete(Long id);

    List<Prodotto> deleteAll();
    
    List<Prodotto> selectAll();
}
