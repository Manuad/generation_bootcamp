package com.generation.inyeccionDependencias.service;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Override
    public String registro(String nombre) {
        return "Hola " + nombre + " a sido registrado";
    }

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }

}
