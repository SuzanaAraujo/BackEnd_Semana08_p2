package senai.fullstack.ExerciciosSemanaisSpring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.fullstack.ExerciciosSemanaisSpring.models.Pets;
import senai.fullstack.ExerciciosSemanaisSpring.services.PetService;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService service;
    public PetController (PetService service){
        this.service = service;
    }

    @GetMapping
    public List<Pets> buscaPets(){
        return service.buscaPets();
    }

    @PostMapping
    public void cadastraPet(@RequestBody Pets novoPet){
        service.salvar(novoPet);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deletaPet(@PathVariable final int id){
        service.deletaPet(id);
    }

    @PutMapping
    public ResponseEntity<Void> atualizaPet(@RequestBody Pets petAtualizado){
       if(service.atualizaPet(petAtualizado)){
           return new ResponseEntity<>(HttpStatus.OK);
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
}
