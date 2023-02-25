package backend.backend.repositories;

import backend.backend.Entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
