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
@Table(name = "unmanned")
public class Unmanned implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unm_id")
    private Long id;
    @Column(name = "unm_name")
    private String name;
    @Column(name = "unm_year")
    private int year;
    @Column(name = "unm_country_of_origin")
    private String countryOfOrigin;
    @Column(name = "unm_power")
    private String power;
    @Column(name = "unm_init_pushing_force")
    private Float initPushingForce;
    @Column(name = "unm_is_active")
    private Boolean isActive;

}
