package com.github.kaydunovdenis.controlofuniverse.service;

import com.github.kaydunovdenis.controlofuniverse.model.EntityUniverse;
import com.github.kaydunovdenis.controlofuniverse.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kaydunov Denis
 * 04.11.2021
 */

// Не работает так как хотелось бы, не находит зависимость для repository,
// думаю это происходит по той причине, что EntityUniverse абстрактный
//@Service
public class EntityServiceImpl /*implements EntityService<EntityUniverse, Long>*/ {

//    @Autowired
//    private EntityRepository repository;
//
//
//    @Override
//    public EntityUniverse create(EntityUniverse entity) {
//        return repository.save(entity);
//    }
//
//    @Override
//    public List<EntityUniverse> readAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public EntityUniverse read(Long id) {
//        return repository.getById(id);
//    }
//
//    @Override
//    public boolean update(EntityUniverse entity, Long id) {
//        if (repository.existsById(id)) {
//            entity.setId(id);
//            repository.save(entity);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean delete(Long id) {
//        if (repository.existsById(id)) {
//            repository.deleteById(id);
//            return true;
//        }
//        return false;
//    }
}
