package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Unmanned;
import com.sofka.spacecraft.repository.UnmannedRepository;
import com.sofka.spacecraft.service.interfaces.IUnmanned;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class UnmannedService implements IUnmanned {
    @Autowired
    private UnmannedRepository unmannedRepository;

    @Override
    public Unmanned createUnmanned(Unmanned unmanned) {
        log.info("Guardando nave sin tripulación");
        return unmannedRepository.save(unmanned);
    }

    @Override
    public Collection<Unmanned> list() {
        log.info("Listando todas las naves sin tripulación");
        return (Collection<Unmanned>) unmannedRepository.findAll();
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Eliminando nave sin tripulación con id: {}", id);
        unmannedRepository.deleteById(id);
        return Boolean.TRUE;
    }
}
