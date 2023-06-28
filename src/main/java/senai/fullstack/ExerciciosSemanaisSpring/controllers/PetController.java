package senai.fullstack.ExerciciosSemanaisSpring.controllers;

import org.springframework.web.bind.annotation.*;
import senai.fullstack.ExerciciosSemanaisSpring.models.Pets;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String buscaPets(){
        return "lista de pets";
    }

    @GetMapping ("/{idPet}") //busca o int que vem após o / na url
    public String buscaPet(@PathVariable("idPet") int id){
        return "este é um pet com id: " + id;
    }

    @PostMapping
    public String cadastraPet(){
        return "pet cadastrado";
    }

//    @PostMapping //CORRIGIR
//    public Pets cadastraObjPet (@RequestBody Pets novoPet) {
//        return novoPet;
//    }

    @DeleteMapping
    public String deletaPet(){
        return "pet deletado";
    }

    @PutMapping
    public String atualizaPet(){
        return "pet atualizado";
    }
}
