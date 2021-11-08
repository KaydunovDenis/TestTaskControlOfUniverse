package com.github.kaydunovdenis.controlofuniverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kaydunov Denis
 * 07.11.2021
 */
public interface EntityRepository<T> extends JpaRepository<T, Long> {
}
