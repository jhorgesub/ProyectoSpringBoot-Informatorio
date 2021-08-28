package com.informatorio.ejemplo.repository;

import com.informatorio.ejemplo.entity.Empleados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends CrudRepository<Empleados, Long> {
}
