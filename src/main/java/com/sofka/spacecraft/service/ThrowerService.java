package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Thrower;
import com.sofka.spacecraft.repository.ThrowerRepository;
import com.sofka.spacecraft.service.interfaces.IThrower;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Slf4j
public class ThrowerService implements IThrower {
    @Autowired
    private ThrowerRepository throwerRepository;

    @Override
    public Collection<Thrower> list() {
        log.info("Listando todas las naves Lanzaderas");
        return (Collection<Thrower>) throwerRepository.findAll();
    }

    @Override
    public Thrower createThrower(Thrower thrower) {
        log.info("Guardando nueva nave Lanzadera");
        return throwerRepository.save(thrower);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Eliminando nave Lanzadera con id: {}", id);
        throwerRepository.deleteById(id);
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateNameThrower(Long id, Thrower thrower){
        log.info("Actualizando nave Lanzadera con id: {}", id);
        throwerRepository.updateNameThrower(id, thrower.getName());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateYearThrower(Long id, Thrower thrower){
        log.info("Actualizando nave Lanzadera con id: {}", id);
        throwerRepository.updateYearThrower(id, thrower.getYear());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateCountryThrower(Long id, Thrower thrower){
        log.info("Actualizando nave Lanzadera con id: {}", id);
        throwerRepository.updateCountryThrower(id, thrower.getCountryOfOrigin());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updatePowerThrower(Long id, Thrower thrower){
        log.info("Actualizando nave Lanzadera con id: {}", id);
        throwerRepository.updatePowerThrower(id, thrower.getPower());
        return Boolean.TRUE;
    }
    @Transactional
    public Boolean updateLoadThrower(Long id, Thrower thrower){
        log.info("Actualizando nave Lanzadera con id: {}", id);
        throwerRepository.updateLoadThrower(id, thrower.getLoad());
        return Boolean.TRUE;
    }
}
