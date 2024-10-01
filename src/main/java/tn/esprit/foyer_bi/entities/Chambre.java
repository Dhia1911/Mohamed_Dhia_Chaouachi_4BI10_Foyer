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

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING) //string(tatl3lik en lettre) ordinal (0,1,2)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc b;
    @OneToMany
    List<Reservation> r;


}
