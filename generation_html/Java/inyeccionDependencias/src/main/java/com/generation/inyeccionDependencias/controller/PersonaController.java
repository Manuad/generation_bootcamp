package com.generation.inyeccionDependencias.controller;

import com.generation.inyeccionDependencias.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonaController {

    private PersonaServiceImpl personaServiceImpl;

    /**
     * Constructor de la clase.
     * Inyección de dependencias, se puede hacer en el constructor o en el método.
     * En este caso se hace en el constructor.
     * @param personaServiceImpl
     */
    @Autowired
    public PersonaController(PersonaServiceImpl personaServiceImpl) {
        this.personaServiceImpl = personaServiceImpl;
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo";
    }

    @GetMapping("/registro")
    public String registro(@RequestParam(value = "nombre", defaultValue = "Desconocido") String nombre) {
        return personaServiceImpl.registro(nombre);
    }

    @GetMapping("/calcular")
    public int calcular(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return personaServiceImpl.calcular(a, b);
    }

}
