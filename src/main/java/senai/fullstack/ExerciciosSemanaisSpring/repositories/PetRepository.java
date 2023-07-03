package senai.fullstack.ExerciciosSemanaisSpring.repositories;

import org.springframework.stereotype.Repository;
import senai.fullstack.ExerciciosSemanaisSpring.models.Pets;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {

    private static final List<Pets> pets = new ArrayList<>();
    private static int idSequence = 0;

    public void salvar (Pets novoPet) {
        novoPet.setId(++idSequence);
        pets.add(novoPet);
    }

    public List<Pets> buscaPets() {
        return pets;
    }

    public Pets buscaId(int id) {
        for (Pets pet : pets){
            if (pet.getId() == id){
                return pet;
            }
        }
        return null;
    }

    public void atualizaPet(Pets petAtualizado) {
        for(Pets pet : pets){
            if (pet.getId() == petAtualizado.getId()){
                pet.setNome(petAtualizado.getNome());
                pet.setRaca(petAtualizado.getRaca());
                pet.setEspecie(petAtualizado.getEspecie());
                pet.setPeso(petAtualizado.getPeso());
                break;
            }
        }
    }

    public void deletaPet(int id) {
        Pets petParaExcluir = null;
        for (Pets pet : pets){
            if (pet.getId() == id){
                petParaExcluir = pet;
                break;
            }
        }
        pets.remove(petParaExcluir);
    }
}
