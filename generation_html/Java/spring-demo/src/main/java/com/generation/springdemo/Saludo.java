package com.generation.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @RestController esta notación se usa para indicar que la clase es un controlador de peticiones REST.
 * @author ManutheBoss
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-rest-controllers">
 */
@RestController
public class Saludo {
    //Peticiones web
    //GET - POST - PUT - DELETE

    /*
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo";
    }
    */
    @GetMapping("/saludo")
    public String saludo() {
      return "Hola Mundo desde Spring";
    }

    @PostMapping("/login")
    public String login() {
      return "Te registraste";
    }
}
