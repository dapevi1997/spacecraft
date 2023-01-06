package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Unmanned;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UnmannedRepository extends JpaRepository<Unmanned,Long> {

    @Modifying
    @Query("update Unmanned unm set unm.name = :name where unm.id= :id")
    void updateNameUnmanned(@Param(value = "id") Long id, @Param(value = "name") String name);
    @Modifying
    @Query("update Unmanned unm set unm.year = :year where unm.id= :id")
    void updateYearUnmanned(@Param(value = "id") Long id, @Param(value = "year") Integer year);
    @Modifying
    @Query("update Unmanned unm set unm.countryOfOrigin = :country where unm.id= :id")
    void updateCountryUnmanned(@Param(value = "id") Long id, @Param(value = "country") String country);
    @Modifying
    @Query("update Unmanned unm set unm.power = :power where unm.id= :id")
    void updatePowerUnmanned(@Param(value = "id") Long id, @Param(value = "power") String power);
    @Modifying
    @Query("update Unmanned unm set unm.initPushingForce = :pforce where unm.id= :id")
    void updatePForceUnmanned(@Param(value = "id") Long id, @Param(value = "pforce") Float pforce);
    @Modifying
    @Query("update Unmanned unm set unm.isActive = :isActive where unm.id= :id")
    void updateIsActiveUnmanned(@Param(value = "id") Long id, @Param(value = "isActive") Boolean isActive);
}
