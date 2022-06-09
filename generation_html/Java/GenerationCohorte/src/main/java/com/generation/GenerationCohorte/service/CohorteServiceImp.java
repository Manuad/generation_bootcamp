package com.generation.GenerationCohorte.service;

import com.generation.GenerationCohorte.model.Cohorte;
import com.generation.GenerationCohorte.repository.CohorteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CohorteServiceImp implements CohorteService {

    CohorteRepository cohorteRepository;

    public CohorteServiceImp(CohorteRepository cohorteRepository) {
        this.cohorteRepository = cohorteRepository;
    }

    @Override
    public Cohorte getCohorteById(Integer id) {
        Optional<Cohorte> optionalCohorte = cohorteRepository.findById(id);
        return optionalCohorte.orElse(null);
    }

    @Override
    public List<Cohorte> getCohortes() {
        return cohorteRepository.findAll();
    }

    @Override
    public List<Cohorte> getCohortesByCiudad(String ciudad) {
        return cohorteRepository.findByCiudad(ciudad);
    }

    @Override
    public List<Map<String, Object>> getIntructorAlumno() {
        return cohorteRepository.obtenerInstructorAlumno();
    }

    @Override
    public Cohorte saveCohorte(Cohorte cohorte) {
        return cohorteRepository.save(cohorte);
    }

    @Override
    public Cohorte updateCohorte(Cohorte cohorte) {
        return cohorteRepository.save(cohorte);
    }

    @Override
    public void deleteCohorte(Integer id) {

    }
}
