package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Bloc;
import tn.esprit.foyer_bi.repositories.BlocRepositories;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PUBLIC)
@AllArgsConstructor

public class BlocServiceImpl implements IBlocService {
    BlocRepositories blocRepositories;


    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepositories.deleteById(idBloc);

    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepositories.findAll();
    }
}

