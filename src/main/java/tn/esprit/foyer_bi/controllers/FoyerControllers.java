package tn.esprit.foyer_bi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Foyer;
import tn.esprit.foyer_bi.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerControllers {
    IFoyerService foyerService;
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return foyerService.addFoyer(f);
    }
    @DeleteMapping("/remove-Foyer/{idFoyer}")
    public void removeFoyer(@PathVariable("idFoyer") Long Fid) {
        foyerService.deleteFoyer(Fid);
    }
    @PutMapping("/modify-Foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer Foyer = foyerService.UpdateFoyer(f);
        return Foyer;
    }
    @GetMapping("/retrieve-all-Foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.getAllFoyer();
        return listFoyers;
    }
}
