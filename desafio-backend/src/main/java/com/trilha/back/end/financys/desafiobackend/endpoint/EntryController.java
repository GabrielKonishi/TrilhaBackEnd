package com.trilha.back.end.financys.desafiobackend.endpoint;

import com.trilha.back.end.financys.desafiobackend.entity.Entry;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class EntryController {

    private List<Entry> listaEntry = new ArrayList<>();

    Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody Entry entry){
        listaEntry.add(entry);
        logger.info("------INICIANDO O METODO DE CADASTRO------");

        return new ResponseEntity<Integer>(listaEntry.indexOf(entry), HttpStatus.CREATED);
    }



}
