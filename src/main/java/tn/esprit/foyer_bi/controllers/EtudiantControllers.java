package tn.esprit.foyer_bi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Etudiant;
import tn.esprit.foyer_bi.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor



public class EtudiantControllers {
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }
    @DeleteMapping("/remove-Etudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable("idEtudiant") Long Eid) {
        etudiantService.deleteEtudiant(Eid);
    }
    @PutMapping("/modify-Etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant Etudiant = etudiantService.UpdateEtudiant(e);
        return Etudiant;
    }
    @GetMapping("/retrieve-all-Etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.getAllEtudiant();
        return listEtudiants;
    }
}
