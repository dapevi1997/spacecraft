package com.sofka.spacecraft.service.interfaces;

import com.sofka.spacecraft.domain.Manned1;

import java.util.Collection;

public interface IManned1 {
    Manned1 createManned1(Manned1 manned1);
    Collection<Manned1> list();
    Boolean delete(Integer id);
}
