package tn.esprit.foyer_bi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Bloc;
import tn.esprit.foyer_bi.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor

public class BlocControllers {
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b);
    }
    @DeleteMapping("/remove-bloc/{idBloc}")
    public void removeBloc(@PathVariable("idBloc") Long BlocId) {
        blocService.deleteBloc(BlocId);
    }
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.UpdateBloc(b);
        return bloc;
    }
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBloc = blocService.getAllBloc();
        return listBloc;
    }


}
