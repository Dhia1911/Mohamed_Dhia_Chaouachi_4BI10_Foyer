package tn.esprit.foyer_bi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.entities.Reservation;

@Repository

public interface ChambreRepositories extends JpaRepository<Chambre,Long> {
    @Repository
    interface ReservationRepositories extends JpaRepository<Reservation,String> {
    }
}
