package com.sofka.spacecraft.service;

import com.sofka.spacecraft.domain.Thrower;
import com.sofka.spacecraft.repository.ThrowerRepository;
import com.sofka.spacecraft.service.interfaces.IThrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThrowerService implements IThrower {
    @Autowired
    private ThrowerRepository throwerRepository;
    @Override
    public Thrower createThrower(Thrower thrower) {
        return throwerRepository.save(thrower);
    }
}
