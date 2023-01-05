package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Thrower;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ThrowerRepository extends JpaRepository<Thrower,Long> {
}
