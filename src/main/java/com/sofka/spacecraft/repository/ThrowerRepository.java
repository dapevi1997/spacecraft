package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Thrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ThrowerRepository extends JpaRepository<Thrower,Long> {
    @Modifying
    @Query("update Thrower thr set thr.name = :name where thr.id= :id")
    void updateNameThrower(@Param(value = "id") Long id, @Param(value = "name") String name);
    @Modifying
    @Query("update Thrower thr set thr.year = :year where thr.id= :id")
    void updateYearThrower(@Param(value = "id") Long id, @Param(value = "year") Integer year);
    @Modifying
    @Query("update Thrower thr set thr.countryOfOrigin = :country where thr.id= :id")
    void updateCountryThrower(@Param(value = "id") Long id, @Param(value = "country") String country);
    @Modifying
    @Query("update Thrower thr set thr.power = :power where thr.id= :id")
    void updatePowerThrower(@Param(value = "id") Long id, @Param(value = "power") String power);
    @Modifying
    @Query("update Thrower thr set thr.load = :load where thr.id= :id")
    void updateLoadThrower(@Param(value = "id") Long id, @Param(value = "load") Float load);
}
