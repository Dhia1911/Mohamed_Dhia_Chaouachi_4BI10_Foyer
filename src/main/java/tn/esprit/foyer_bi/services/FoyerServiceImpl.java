package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Etudiant;
import tn.esprit.foyer_bi.entities.Foyer;
import tn.esprit.foyer_bi.repositories.FoyerRepositories;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class FoyerServiceImpl implements IFoyerService{
    FoyerRepositories foyerRepositories;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepositories.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepositories.deleteById(idFoyer);

    }

    @Override
    public Foyer UpdateFoyer(Foyer foyer) {
        return foyerRepositories.save(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepositories.findAll();
    }
}
