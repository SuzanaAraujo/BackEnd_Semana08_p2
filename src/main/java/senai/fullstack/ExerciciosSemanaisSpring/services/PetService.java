package senai.fullstack.ExerciciosSemanaisSpring.services;

import org.springframework.stereotype.Service;
import senai.fullstack.ExerciciosSemanaisSpring.models.Pets;
import senai.fullstack.ExerciciosSemanaisSpring.repositories.PetRepository;

import java.util.List;

@Service
public class PetService {

    private final PetRepository repository;
    public PetService (PetRepository repository){
        this.repository = repository;
    }

    public void salvar(Pets novoPet) {
        repository.salvar(novoPet);
    }

    public List<Pets> buscaPets() {
        return repository.buscaPets();
    }

    public boolean atualizaPet(Pets petAtualizado) {
        Pets petAntigo = repository.buscaId(petAtualizado.getId());
        if (petAntigo == null) return false;
        repository.atualizaPet(petAtualizado);
        return true;
    }

    public void deletaPet(int id) {
        repository.deletaPet(id);
    }
}
