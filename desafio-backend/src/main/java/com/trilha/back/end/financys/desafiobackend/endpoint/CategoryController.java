package com.trilha.back.end.financys.desafiobackend.endpoint;

import com.trilha.back.end.financys.desafiobackend.entity.Category;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    private List<Category> listaCategoria = new ArrayList<>();

    Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody Category category){
        listaCategoria.add(category);
        logger.info("------INICIANDO O METODO DE CADASTRO------");

        return new ResponseEntity<Integer>(listaCategoria.indexOf(category), HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> read(){
        Category category = new Category(1L, "test", "test_description");
        listaCategoria.add(category);
        return listaCategoria;
    }
    


}
