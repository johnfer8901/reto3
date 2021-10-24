package co.usa.Reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.Reto3.reto3.model.Categoria;
import co.usa.Reto3.reto3.repository.crud.CategoriaCrudRepository;

@Repository
public class CategoriaRepository {
    
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){

        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public Optional<Categoria> getCategoria(int id){

        return categoriaCrudRepository.findById(id);

    }

    public Categoria save(Categoria c){

        return categoriaCrudRepository.save(c);
    }
}
