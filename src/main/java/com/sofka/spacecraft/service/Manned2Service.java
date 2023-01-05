package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Manned2;
import com.sofka.spacecraft.repository.Manned2Repository;
import com.sofka.spacecraft.service.interfaces.IManned2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return (Collection<Manned2>) manned2Repository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        log.info("Eliminando nave Tripulada tipo 2 con id: {}", id);
        manned2Repository.deleteById(id);
        return Boolean.TRUE;
    }
}
