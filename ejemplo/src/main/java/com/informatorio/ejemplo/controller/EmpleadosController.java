package com.informatorio.ejemplo.controller;

import com.informatorio.ejemplo.entity.Empleados;
import com.informatorio.ejemplo.repository.EmpleadosRepository;
import com.informatorio.ejemplo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadosController {

    private EmpleadosRepository repository;
    private HelloService helloService;

    @Autowired
    public EmpleadosController(EmpleadosRepository repository, HelloService helloService) {
        this.repository = repository;
        this.helloService = helloService;
    }

    @GetMapping(value = "/empleados")
    public @ResponseBody Iterable<Empleados> findEmpleados () {
        return repository.findAll();
    }

    /*@GetMapping(value = "/empleadosContratados")
    public @ResponseBody
    Iterable<Empleados> findContratados () { return repository.findAll(); }

    @GetMapping(value = "/saludar")
    public @ResponseBody String saludar() { return helloService.saludar(); }*/

}
