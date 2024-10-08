package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Etudiant;
import tn.esprit.foyer_bi.repositories.EtudiantRepositories;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepositories etudiantRepositories;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepositories.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepositories.deleteById(idEtudiant);

    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant etudiant) {
        return etudiantRepositories.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepositories.findAll();
    }
}
