package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Manned1;
import com.sofka.spacecraft.repository.Manned1Repository;
import com.sofka.spacecraft.service.interfaces.IManned1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class Manned1Service implements IManned1 {
    @Autowired
    private Manned1Repository manned1Repository;

    @Override
    public Collection<Manned1> list() {
        log.info("Listando todas las nave Tripulada tipo 1");
        return (Collection<Manned1>) manned1Repository.findAll();
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
}
