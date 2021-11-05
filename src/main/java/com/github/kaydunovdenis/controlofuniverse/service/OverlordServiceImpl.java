package com.github.kaydunovdenis.controlofuniverse.service;

import com.github.kaydunovdenis.controlofuniverse.model.Overlord;
import com.github.kaydunovdenis.controlofuniverse.repository.OverlordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kaydunov Denis
 * 05.11.2021
 */
@Service
public class OverlordServiceImpl implements OverlordService {

    @Autowired
    private OverlordRepository repository;

    @Override
    public Overlord create(Overlord entity) {
        return repository.save(entity);
    }

    @Override
    public List<Overlord> readAll() {
        return repository.findAll();
    }

    @Override
    public Overlord read(Long id) {
        return repository.getById(id);
    }

    @Override
    public boolean update(Overlord entity, Long id) {
        if (repository.existsById(id)) {
            entity.setId(id);
            repository.save(entity);
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
