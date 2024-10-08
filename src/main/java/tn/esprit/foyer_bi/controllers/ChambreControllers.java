package tn.esprit.foyer_bi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor

public class ChambreControllers {
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @DeleteMapping("/remove-chambre/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long chId) {
        chambreService.deleteChambre(chId);
    }
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.UpdateChambre(c);
        return chambre;
    }
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getAllChambre();
        return listChambres;
    }





}
