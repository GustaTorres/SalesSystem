package br.com.psgv.salessystem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.psgv.salessystem.domain.Categoria;
import br.com.psgv.salessystem.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;
    
    public Categoria buscar(Integer id){
        Optional<Categoria> categoria = repo.findById(id);
        return categoria.orElse(null);
    }

}
