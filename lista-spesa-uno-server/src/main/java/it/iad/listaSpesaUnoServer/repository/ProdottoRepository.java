package it.iad.listaSpesaUnoServer.repository;
import it.iad.listaSpesaUnoServer.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{
}
