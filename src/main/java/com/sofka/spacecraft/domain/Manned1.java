package com.sofka.spacecraft.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Entity
@Table(name="manned1")

public class Manned1 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "man_id")
    private Integer id;

    @Column(name = "man_name")
    private String name;

    @Column(name = "man_year")
    private Integer year;

    @Column(name = "man_country_of_origin")
    private String country;

    @Column(name = "man_power")
    private String power;

    @Column(name = "man_number_of_crews")
    private Integer ncrew;
}

