package tn.esprit.foyer_bi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer_bi.entities.Universite;
@Repository

public interface UniversiteRepositories extends JpaRepository<Universite,Long> {
}
