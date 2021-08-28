package com.informatorio.ejemplo.config;

import com.informatorio.ejemplo.entity.EmpleadosJornada;
import com.informatorio.ejemplo.repository.EmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class EmpleadosRunner implements CommandLineRunner {

    @Autowired
    private EmpleadosRepository empleadosRepository;

    @Override
    public void run(String... args) throws Exception {
        EmpleadosJornada empleadosJornada = new EmpleadosJornada();
        empleadosJornada.setApellido("Subeldia");
        empleadosJornada.setNombre("Derliz");
        empleadosJornada.setFechaNacimiento(LocalDate.now().minusYears(64));
        empleadosJornada.setPrecioHora(new BigDecimal(2500));

        empleadosRepository.save(empleadosJornada);
    }
}
