package com.sofka.spacecraft.service;


import com.sofka.spacecraft.domain.Unmanned;
import com.sofka.spacecraft.repository.UnmannedRepository;
import com.sofka.spacecraft.service.interfaces.IUnmanned;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Boolean updateNameUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updateNameUnmanned(id, unmanned.getName());
        return Boolean.TRUE;
    }

    @Transactional
    public Boolean updateYearUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updateYearUnmanned(id, unmanned.getYear());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateCountryUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updateCountryUnmanned(id, unmanned.getCountryOfOrigin());
        return Boolean.TRUE;
    }

    @Transactional
    public Boolean updatePowerUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updatePowerUnmanned(id, unmanned.getPower());
        return Boolean.TRUE;
    }

    @Transactional
    public Boolean updatePForceUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updatePForceUnmanned(id, unmanned.getInitPushingForce());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateIsActiveUnmanned(Long id, Unmanned unmanned){
        log.info("Actualizando nave sin tripulación con id: {}", id);
        unmannedRepository.updateIsActiveUnmanned(id, unmanned.getIsActive());
        return Boolean.TRUE;
    }
}
