package com.generation.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController esta notación se usa para indicar que la clase es un controlador de peticiones REST.
 */
@RestController
/**
 * @RequestMapping es una anotación que se usa para indicar que la clase es un controlador de peticiones REST.
 * Nos permite definir una ruta de acceso para una clase.
 */
@RequestMapping("api/mandardatos")
public class MandarDatos {

    @GetMapping("/saludo")
    public String saludo() {
        return "Este es otro saludo";
    }

    /**
     * Pedir datos al usuario
     */
    @GetMapping("/mandarsaludos")
    public String mandarSaludos(
            @RequestParam(value = "nombre", defaultValue = "CH12") String nombre,
            @RequestParam(value = "apellido", defaultValue = "MXN") String apellido
    ) {
        return "Le mando saludos a " + nombre + " " + apellido;
    }
}
