package com.informatorio.ejemplo.controller;

import com.informatorio.ejemplo.entity.Alumnos;
import com.informatorio.ejemplo.repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnosController {

    private AlumnosRepository repository;

    @Autowired
    public AlumnosController(AlumnosRepository repository) {
        this.repository = repository;
    }

    @GetMapping (value = "/alumnos")
    public @ResponseBody Iterable<Alumnos> findAlumnos () {
        return repository.findAll();
    }


}
