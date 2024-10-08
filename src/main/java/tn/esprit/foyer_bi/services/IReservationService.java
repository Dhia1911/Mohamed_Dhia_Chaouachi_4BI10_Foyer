package tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.entities.Reservation;

import java.util.List;




public interface IReservationService {
    public Reservation addReservation (Reservation reservation); //signature
    public void deleteReservation (String idReservation); //au delete en maitre void
    public Reservation UpdateReservation(Reservation reservation);
    public List<Reservation> getAllReservation();
}
