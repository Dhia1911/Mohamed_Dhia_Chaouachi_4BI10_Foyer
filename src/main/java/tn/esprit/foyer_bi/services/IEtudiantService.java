package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Etudiant addEtudiant (Etudiant etudiant); //signature
    public void deleteEtudiant (Long idEtudiant); //au delete en maitre void
    public Etudiant UpdateEtudiant (Etudiant etudiant);
    public List<Etudiant> getAllEtudiant();
}
