package com.generation.GenerationCohorte.service;

import com.generation.GenerationCohorte.model.Cohorte;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;

import java.util.List;
import java.util.Map;

public interface CohorteService {

    /**
     * Por se una interface, no se puede crear una instancia de ella. Además, sus métodos son abstractos
     * Todas las clases que lo implementen deben implementar todos los métodos abstractos de la interface
     */

    // Leer
    Cohorte getCohorteById(Integer id); // Obtener una cohorte por su id
    List<Cohorte> getCohortes(); // Obtener todas las cohortes

    List<Cohorte> getCohortesByCiudad(String ciudad); // Obtener todas las cohortes por su ciudad
    List<Map<String, Object>> getIntructorAlumno(); // Obtener todos los alumnos e instructores

    // Crear
    Cohorte saveCohorte(Cohorte cohorte); // Guardar una cohorte

    // Actualizar
    Cohorte updateCohorte(Cohorte cohorte); // Actualizar una cohorte

    // Eliminar
    void deleteCohorte(Integer id); // Eliminar una cohorte
}
