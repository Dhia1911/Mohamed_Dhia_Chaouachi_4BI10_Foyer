package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Etudiant;
import tn.esprit.foyer_bi.entities.Foyer;
import tn.esprit.foyer_bi.entities.Universite;

import java.util.List;



public interface IUniversiteService {
    public Universite addUniversite (Universite universite); //signature
    public void deleteUniversite (Long idUniversite); //au delete en maitre void
    public Universite UpdateUniversite(Universite universite);
    public List<Universite> getAllUniversite();
}
