package com.github.kaydunovdenis.controlofuniverse.service;

import com.github.kaydunovdenis.controlofuniverse.model.Planet;
import com.github.kaydunovdenis.controlofuniverse.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kaydunov Denis
 * 06.11.2021
 */
@Service
public class PlanetServiceImpl implements EntityService<Planet, Long> {

    private final PlanetRepository repository;

    @Autowired
    public PlanetServiceImpl(PlanetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Planet create(Planet planet) {
        return repository.save(planet);
    }

    @Override
    public List<Planet> readAll() {
        return repository.findAll();
    }

    @Override
    public Planet read(Long id) {
        return repository.getById(id);
    }

    @Override
    public boolean update(Planet planet, Long id) {
        if (repository.existsById(id)) {
            planet.setId(id);
            repository.save(planet);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
