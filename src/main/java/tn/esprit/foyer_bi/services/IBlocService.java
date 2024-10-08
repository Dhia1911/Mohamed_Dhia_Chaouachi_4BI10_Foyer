package tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.entities.Bloc;

import java.util.List;



public interface IBlocService {
    public Bloc addBloc (Bloc bloc); //signature
    public void deleteBloc (Long idBloc); //au delete en maitre void
    public Bloc UpdateBloc(Bloc bloc);
    public List<Bloc> getAllBloc();
}
