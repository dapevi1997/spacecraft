package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Unmanned;
import org.springframework.data.repository.CrudRepository;

public interface MannedRepository extends CrudRepository<Unmanned,Long> {
}
