package com.sofka.spacecraft.repository;

import com.sofka.spacecraft.domain.Manned2;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Manned2Repository extends CrudRepository<Manned2, Integer> {
    @Modifying
    @Query("update Manned2 man2 set man.name = :name where man.id = :id")
    public void updateName(
            @Param(value = "id") Integer id,
            @Param(value = "name") String name
    );

    @Modifying
    @Query("update Manned2 man2 set man.year = :year where man.id = :id")
    public void updateYear(
            @Param(value = "id") Integer id,
            @Param(value = "year") Integer year
    );

    //@Modifying
    //@Query("update Manned2 man2 set man.country.of.origin = :country where man.id = :id")
    //public void updateCountry(
    //        @Param(value = "id") Integer id,
    //        @Param(value = "country") String country
    //);

    @Modifying
    @Query("update Manned2 man2 set man.power = :power where man.id = :id")
    public void updatePower(
            @Param(value = "id") Integer id,
            @Param(value = "power") String power
    );

    //@Modifying
    //@Query("update Manned2 man2 set man.number.of.crews = :ncrew where man.id = :id")
    //public void updateNumCrew(
    //        @Param(value = "id") Integer id,
    //        @Param(value = "ncrew") Integer ncrew
    //);
}
