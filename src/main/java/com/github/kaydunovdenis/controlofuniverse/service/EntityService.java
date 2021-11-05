package com.github.kaydunovdenis.controlofuniverse.service;

/**
 * @author Kaydunov Denis
 * 03.11.2021
 */
public interface EntityService<T, D> {

    T create(T object);

    T read(D id);

    Iterable<T> readAll();

    boolean update(T object, D id);

    boolean delete(D id);
}
