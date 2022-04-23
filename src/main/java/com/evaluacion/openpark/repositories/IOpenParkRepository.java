package com.evaluacion.openpark.repositories;

import com.evaluacion.openpark.OpenparkApplication;
import com.evaluacion.openpark.enums.Especialidad;
import com.evaluacion.openpark.model.Entrenador;
import com.evaluacion.openpark.model.Postulante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IOpenParkRepository extends CrudRepository<OpenparkApplication,Integer> {

    @Query("select x from Postulante x where x.name = ?1 and x.age= ?2")
    Optional<Postulante> obtenerPostulantePorNombreYEdad(String name, int fecha_nacimiento);

    @Query("select x from Entrenador x where x.especialidad = ?1")
    List<Entrenador>  obtenerEntrenadorPorEspecialidad(Especialidad especialidad);

}
