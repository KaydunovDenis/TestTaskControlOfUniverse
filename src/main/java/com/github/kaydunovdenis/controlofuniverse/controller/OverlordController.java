package com.github.kaydunovdenis.controlofuniverse.controller;

import com.github.kaydunovdenis.controlofuniverse.model.Overlord;
import com.github.kaydunovdenis.controlofuniverse.service.OverlordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kaydunov Denis
 * 05.11.2021
 */
@RestController
public class OverlordController {

    private final OverlordServiceImpl overlordService;

    @Autowired
    public OverlordController(OverlordServiceImpl overlordService) {
        this.overlordService = overlordService;
    }

    /**
     */
    @PostMapping(value = "/overlords")
    public ResponseEntity<?> create(@RequestBody Overlord overlord) {
        overlordService.create(overlord);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/overlords")
    public ResponseEntity<List<Overlord>> read() {
        final List<Overlord> clients = overlordService.readAll();

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/overlords/{id}")
    public ResponseEntity<Overlord> read(@PathVariable(name = "id") Long id) {
        final Overlord overlord = overlordService.read(id);

        return overlord != null
                ? new ResponseEntity<>(overlord, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/overlords/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody Overlord overlord) {
        final boolean updated = overlordService.update(overlord, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/overlords/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        final boolean deleted = overlordService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
