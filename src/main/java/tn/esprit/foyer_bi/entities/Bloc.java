package tn.esprit.foyer_bi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idBloc;
    private String nomBloc;
    private String capaciteBloc;

    @ManyToOne
    private Foyer foy;
    @OneToMany
    List<Chambre> c;

}
