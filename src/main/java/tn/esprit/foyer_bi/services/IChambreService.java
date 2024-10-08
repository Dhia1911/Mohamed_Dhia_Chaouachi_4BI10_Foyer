package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Chambre;

import java.util.List;



public interface IChambreService {
    public Chambre addChambre (Chambre chambre); //signature
    public void deleteChambre (Long idChambre); //au delete en maitre void
    public Chambre UpdateChambre(Chambre chambre);
    public List<Chambre> getAllChambre();

}
