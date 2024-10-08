package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Universite;
import tn.esprit.foyer_bi.repositories.UniversiteRepositories;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepositories universiteRepositories;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepositories.deleteById(idUniversite);

    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepositories.findAll();
    }
}
