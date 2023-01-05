package com.sofka.spacecraft.service.interfaces;

import com.sofka.spacecraft.domain.Thrower;

import java.util.Collection;

public interface IThrower {

    Thrower createThrower(Thrower thrower);
    Collection<Thrower> list();
    Boolean delete(Long id);

}
