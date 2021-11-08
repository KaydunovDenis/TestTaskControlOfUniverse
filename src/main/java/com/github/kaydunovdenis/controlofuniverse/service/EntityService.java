package com.github.kaydunovdenis.controlofuniverse.service;

import com.github.kaydunovdenis.controlofuniverse.model.EntityUniverse;

/**
 * @author Kaydunov Denis
 * 03.11.2021
 */
public interface EntityService<T extends EntityUniverse, D> {

    T create(T object);

    Iterable<T> readAll();

    T read(D id);

    boolean update(T object, D id);

    boolean delete(D id);
    //create+update в одном месте

}
