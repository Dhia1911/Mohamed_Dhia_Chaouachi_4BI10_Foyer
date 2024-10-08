package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Reservation;
import tn.esprit.foyer_bi.repositories.ReservationRepositories;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class ReservationServiceImpl implements IReservationService{
    ReservationRepositories reservationRepositories;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepositories.deleteById(idReservation);

    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepositories.findAll();
    }
}
