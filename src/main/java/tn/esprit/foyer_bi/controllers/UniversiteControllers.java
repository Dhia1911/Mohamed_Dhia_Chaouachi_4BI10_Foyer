package tn.esprit.foyer_bi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Universite;
import tn.esprit.foyer_bi.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor

public class UniversiteControllers {
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return universiteService.addUniversite(u);
    }
    @DeleteMapping("/remove-Universite/{idUniversite}")
    public void removeUniversite(@PathVariable("idUniversite") Long Uid) {
        universiteService.deleteUniversite(Uid);
    }
    @PutMapping("/modify-Universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite Universite = universiteService.UpdateUniversite(u);
        return Universite;
    }
    @GetMapping("/retrieve-all-Universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.getAllUniversite();
        return listUniversites;
    }
}
