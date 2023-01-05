package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Unmanned;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnmannedRepository extends JpaRepository<Unmanned,Long> {
}
