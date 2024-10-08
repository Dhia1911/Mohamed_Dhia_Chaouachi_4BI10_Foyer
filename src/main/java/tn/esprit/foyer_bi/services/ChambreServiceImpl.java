package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.repositories.ChambreRepositories;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class ChambreServiceImpl implements IChambreService {
    ChambreRepositories chambreRepositories;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepositories.deleteById(idChambre);

    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepositories.findAll();
    }
}
