package senai.fullstack.ExerciciosSemanaisSpring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @GetMapping
    public String retornarTutores(){
        return "lista de tutores existentes";
    }

    @PostMapping
    public String cadastrarTutor(){
        return "tutor cadastrado com sucesso!";
    }

    @DeleteMapping
    public String deletarTutor(){
        return "tutor deletado";
    }

    @PutMapping
    public String alterarTutor(){
        return "cadastro alterado";
    }

}
