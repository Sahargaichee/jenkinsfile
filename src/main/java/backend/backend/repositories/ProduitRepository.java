package backend.backend.repositories;

import backend.backend.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
