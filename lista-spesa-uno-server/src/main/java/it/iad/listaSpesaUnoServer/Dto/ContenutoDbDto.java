package it.iad.listaspesaunoserver.Dto;

import it.iad.listaspesaunoserver.model.Prodotto;
import java.util.ArrayList;
import java.util.List;

public class ContenutoDbDto {
    private List<Prodotto> contenutoDB;

    public ContenutoDbDto() {
    }

    public ContenutoDbDto(List<Prodotto> contenutoDB) {
        this.contenutoDB = contenutoDB;
    }
    

    public List<Prodotto> getContenutoDB() {
        return contenutoDB;
    }

    public void setContenutoDB(List<Prodotto> contenutoDB) {
        this.contenutoDB = contenutoDB;
    }
    
    
    

    
}
