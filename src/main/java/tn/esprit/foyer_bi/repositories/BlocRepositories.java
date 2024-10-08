package tn.esprit.foyer_bi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer_bi.entities.Bloc;
@Repository

public interface BlocRepositories extends JpaRepository<Bloc,Long> {
}
