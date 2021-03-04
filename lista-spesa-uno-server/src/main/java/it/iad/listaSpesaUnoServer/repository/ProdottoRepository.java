package it.iad.listaspesaunoserver.repository;

import it.iad.listaspesaunoserver.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
}
