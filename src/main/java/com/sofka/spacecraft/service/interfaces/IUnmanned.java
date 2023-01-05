package com.sofka.spacecraft.service.interfaces;

import com.sofka.spacecraft.domain.Unmanned;

import java.util.Collection;

public interface IUnmanned {
    Unmanned createUnmanned(Unmanned unmanned);
    Collection<Unmanned> list();
    Boolean delete(Long id);
}
