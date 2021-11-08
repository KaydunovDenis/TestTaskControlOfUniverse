package com.github.kaydunovdenis.controlofuniverse.util_api;

import com.github.kaydunovdenis.controlofuniverse.model.Overlord;
import com.github.kaydunovdenis.controlofuniverse.model.Planet;
import com.github.kaydunovdenis.controlofuniverse.service.OverlordService;
import com.github.kaydunovdenis.controlofuniverse.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kaydunov Denis
 * 06.11.2021
 */
@Service
public class UniverseApiImpl implements UniverseApiI {
    private final OverlordService overlordService;
    private final PlanetService planetService;

    @Autowired
    public UniverseApiImpl(OverlordService overlordService, PlanetService planetService) {
        this.overlordService = overlordService;
        this.planetService = planetService;
    }

    @Override
    public Overlord addOverLord(Overlord overlord) {
        return overlordService.create(overlord);
    }

    @Override
    public Planet addPlanet(Planet planet) {
        return planetService.create(planet);
    }

    @Override
    public void setOverlordToRulePlanet(Overlord overlord, Planet planet) {
        overlord.getPlanets().add(planet.getId());
        overlordService.update(overlord, overlord.getId());
    }

    @Override
    public void destroyPlanet(Planet planet) {
        planetService.delete(planet.getId());
    }

    @Override
    public List<Overlord> findOverlordsWithoutPlanet() {
        return overlordService.readAll().stream()
                .filter(overlord -> overlord.getPlanets().isEmpty())
                .collect(Collectors.toList());
        //TODO переписать через скрипт SQL
    }

    @Override
    public List<Overlord> find10YoungestOverlords() {
        return overlordService.readAll().stream()
                .sorted(Comparator.comparingInt(Overlord::getAge))
                .limit(10)
                .collect(Collectors.toList());
    }
}
