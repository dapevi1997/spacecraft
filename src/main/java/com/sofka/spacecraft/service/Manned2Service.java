package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Manned2;
import com.sofka.spacecraft.repository.Manned2Repository;
import com.sofka.spacecraft.service.interfaces.IManned2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Slf4j
public class Manned2Service implements IManned2{
    @Autowired
    private Manned2Repository manned2Repository;

    @Override
    public Manned2 createManned2(Manned2 manned2) {
        log.info("Crear una nave Tripulante tipo 2");
        return manned2Repository.save(manned2);
    }

    @Override
    public Collection<Manned2> list() {
        log.info("Listando todas las nave Tripulada tipo 2");
        return manned2Repository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        log.info("Eliminando nave Tripulada tipo 2 con id: {}", id);
        manned2Repository.deleteById(id);
        return Boolean.TRUE;
    }

    @Transactional
    public Manned2 updateName(Integer id, Manned2 manned2){
        log.info("Actualiza el nombre de la nave Tripulada de tipo 1 con id: {}", id);
        manned2Repository.updateName(id, manned2.getName());
        return manned2;
    }

    @Transactional
    public Manned2 updatePower(Integer id, Manned2 manned2){
        log.info("Actualiza el poder de la nave Tripulada de tipo 1 con id: {}", id);
        manned2Repository.updatePower(id, manned2.getPower());
        return manned2;
    }

    @Transactional
    public Manned2 updateYear(Integer id, Manned2 manned2){
        log.info("Actualiza el año de la nave Tripulada de tipo 1 con id: {}", id);
        manned2Repository.updateYear(id, manned2.getYear());
        return manned2;
    }

    @Transactional
    public Manned2 updateCountry(Integer id, Manned2 manned2){
        log.info("Actualiza el pais de origen de la nave Tripulada de tipo 1 con id: {}", id);
        manned2Repository.updateCountry(id, manned2.getCountry());
        return manned2;
    }

    @Transactional
    public Manned2 updateNCrew(Integer id, Manned2 manned2){
        log.info("Actualiza el numero de tripulantes de la nave Tripulada de tipo 1 con id: {}", id);
        manned2Repository.updateNCrew(id, manned2.getNcrew());
        return manned2;
    }

}
