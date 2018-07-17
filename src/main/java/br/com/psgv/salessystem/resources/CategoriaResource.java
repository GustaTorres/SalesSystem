package br.com.psgv.salessystem.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.psgv.salessystem.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar(){
        
        Categoria c1 = new Categoria(1,"Informática");
        Categoria c2 = new Categoria(1,"Escritório");
        
        List<Categoria> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        
        return list;
    }

}
