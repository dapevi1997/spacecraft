package com.sofka.spacecraft.service.interfaces;

import com.sofka.spacecraft.domain.Manned2;

import java.util.Collection;

public interface IManned2 {
    Manned2 createManned2(Manned2 manned1);
    Collection<Manned2> list();
    Boolean delete(Integer id);
}
