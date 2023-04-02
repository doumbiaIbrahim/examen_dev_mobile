package sn.esmt.OffreEmploye.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.OffreEmploye.dao.CvRepository;
import sn.esmt.OffreEmploye.entities.CvEntities;


import java.util.List;
@RestController
@RequestMapping(value = "/accueil")
@AllArgsConstructor
public class CvController {
    private CvRepository CvRepository;

    //spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP POST est envoyée à l'URL /cvs/save.
    @PostMapping(path = "/save")//POST REQUEST
    //@RequestBody indique que les données de la requête HTTP
    // doivent être converties en un objet AppUserEntity
    public CvEntities save(@RequestBody CvEntities CvEntities){
        return CvRepository.save(CvEntities);
    }
    @GetMapping(path = "/all")
    public List<CvEntities> getAll(){
        return CvRepository.findAll();
    }
    @GetMapping(path = "/login")//GET REQUEST: "login" est un point d'entrée HTTP GET pour l'URI "/login".
    public ApiLoginResponse login(@RequestParam String email,@RequestParam String adresse){
        CvEntities CvEntities = CvRepository.findByEmailAndAdresse(email, adresse);
        if(CvEntities != null){

            return new ApiLoginResponse("OK",email);
        }else{
            return new ApiLoginResponse("NOK",email);
        }
    }
}