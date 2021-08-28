package com.informatorio.ejemplo.repository;

import com.informatorio.ejemplo.entity.Alumnos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AlumnosRepository extends CrudRepository<Alumnos, Long> {
}
