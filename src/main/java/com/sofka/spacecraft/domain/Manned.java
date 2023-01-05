package com.sofka.spacecraft.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase referenciar una tabla SQL a objetos.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Data
@Entity
@Table(name = "manned")
public class Manned implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "man_id")
    private Long id;
    @Column(name = "man_name")
    private String name;
    @Column(name = "man_year")
    private int year;
    @Column(name = "man_country_of_origin")
    private String countryOfOrigin;
    @Column(name = "man_power")
    private String power;
    @Column(name = "man_number_of_crews")
    private int numberOfCrews;

}
