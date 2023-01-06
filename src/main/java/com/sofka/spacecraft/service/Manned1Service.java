package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Manned1;
import com.sofka.spacecraft.repository.Manned1Repository;
import com.sofka.spacecraft.service.interfaces.IManned1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Slf4j
public class Manned1Service implements IManned1 {
    @Autowired
    private Manned1Repository manned1Repository;

    @Override
    public Collection<Manned1> list() {
        log.info("Listando todas las nave Tripulada tipo 1");
        return manned1Repository.findAll();
    }

    @Override
    public Manned1 createManned1(Manned1 manned1) {
        log.info("Crear una nave Tripulante tipo 1");
        return manned1Repository.save(manned1);
    }

    @Override
    public Boolean delete(Integer id) {
        log.info("Eliminando nave Tripulada tipo 1 con id: {}", id);
        manned1Repository.deleteById(id);
        return Boolean.TRUE;
    }

    @Transactional
    public Manned1 updateName(Integer id, Manned1 manned1){
        log.info("Actualiza el nombre de la nave Tripulada de tipo 1 con id: {}", id);
        manned1Repository.updateName(id, manned1.getName());
        return manned1;
    }

    @Transactional
    public Manned1 updatePower(Integer id, Manned1 manned1){
        log.info("Actualiza el poder de la nave Tripulada de tipo 1 con id: {}", id);
        manned1Repository.updatePower(id, manned1.getPower());
        return manned1;
    }

    @Transactional
    public Manned1 updateYear(Integer id, Manned1 manned1){
        log.info("Actualiza el año de la nave Tripulada de tipo 1 con id: {}", id);
        manned1Repository.updateYear(id, manned1.getYear());
        return manned1;
    }

    @Transactional
    public Manned1 updateCountry(Integer id, Manned1 manned1){
        log.info("Actualiza el pais de origen de la nave Tripulada de tipo 1 con id: {}", id);
        manned1Repository.updateCountry(id, manned1.getCountry());
        return manned1;
    }

    @Transactional
    public Manned1 updateNCrew(Integer id, Manned1 manned1){
        log.info("Actualiza el numero de tripulantes de la nave Tripulada de tipo 1 con id: {}", id);
        manned1Repository.updateNCrew(id, manned1.getNcrew());
        return manned1;
    }
}
