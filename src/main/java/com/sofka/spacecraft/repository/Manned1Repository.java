package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Manned1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface Manned1Repository extends JpaRepository<Manned1, Integer>{
    @Modifying
    @Query("update Manned1 man set man.name = :name where man.id = :id")
    public void updateName(@Param(value = "id") Integer id, @Param(value = "name") String name);

    @Modifying
    @Query("update Manned1 man set man.power = :power where man.id = :id")
    public void updatePower(@Param(value = "id") Integer id, @Param(value = "power") String power);

    @Modifying
    @Query("update Manned1 man set man.year = :year where man.id = :id")
    public void updateYear(@Param(value = "id") Integer id, @Param(value = "year") Integer year);

    @Modifying
    @Query("update Manned1 man set man.country = :country where man.id = :id")
    public void updateCountry(@Param(value = "id") Integer id, @Param(value = "country") String country);

    @Modifying
    @Query("update Manned1 man set man.ncrew = :ncrew where man.id = :id")
    public void updateNCrew(@Param(value = "id") Integer id, @Param(value = "ncrew") Integer ncrew);
}
