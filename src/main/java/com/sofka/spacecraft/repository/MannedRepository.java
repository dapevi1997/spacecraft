package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Manned;
import org.springframework.data.repository.CrudRepository;

public interface MannedRepository extends CrudRepository<Manned,Long> {
}
