package com.github.kaydunovdenis.controlofuniverse.service;

import com.github.kaydunovdenis.controlofuniverse.model.Overlord;

import java.util.List;

/**
 * @author Kaydunov Denis
 * 05.11.2021
 */
public interface OverlordService {
    Overlord create(Overlord entity);

    List<Overlord> readAll();

    Overlord read(Long id);

    boolean update(Overlord entity, Long id);

    boolean delete(Long id);
}
