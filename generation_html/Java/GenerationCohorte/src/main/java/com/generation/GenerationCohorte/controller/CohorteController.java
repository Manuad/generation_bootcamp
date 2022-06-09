package com.generation.GenerationCohorte.controller;

import com.generation.GenerationCohorte.model.Cohorte;
import com.generation.GenerationCohorte.service.CohorteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/cohorte")
public class CohorteController {

    private CohorteService cohorteService;

    public CohorteController(CohorteService cohorteService) {
        this.cohorteService = cohorteService;
    }

    @GetMapping("/{id}")
    public Cohorte getCohorteById(Integer id) {
        return cohorteService.getCohorteById(id);
    }

    @GetMapping("/all")
    public List<Cohorte> getCohortes() {
        return cohorteService.getCohortes();
    }

    @GetMapping("/city")
    public List<Cohorte> getCohortesByCiudad(@RequestParam(value = "ciudad", defaultValue = "") String ciudad) {
        return cohorteService.getCohortesByCiudad(ciudad);
    }

    @PostMapping("/save")
    public Cohorte saveCohorte(@RequestBody Cohorte cohorte) {
        return cohorteService.saveCohorte(cohorte);
    }

    @GetMapping("/instructor-alumno")
    public List<Map<String, Object>> getIntructorAlumno() {
        return cohorteService.getIntructorAlumno();
    }

    public Cohorte updateCohorte(Cohorte cohorte) {
        return cohorteService.updateCohorte(cohorte);
    }

    public void deleteCohorte(Integer id) {
        cohorteService.deleteCohorte(id);
    }

}
