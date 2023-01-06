package com.sofka.spacecraft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
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
@NoArgsConstructor
@Table(name = "unmanned")
public class Unmanned implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unm_id")
    private Long id;
    @NonNull()
    @NotEmpty(message = "Nombre es requerido")
    @Column(name = "unm_name")
    private String name;
    @NonNull()
    @Digits(fraction = 2, integer = 4, message = "El año debe ser válido")
    @Column(name = "unm_year")
    private int year;
    @NonNull()
    @NotEmpty(message = "País de origen es requerido")
    @Column(name = "unm_country_of_origin")
    private String countryOfOrigin;
    @NonNull()
    @NotEmpty(message = "Potencia es requerida")
    @Column(name = "unm_power")
    private String power;
    @NonNull()
    @Digits(fraction = 2, integer = 4, message = "La fuerza de inicialización debe ser válida")
    @Column(name = "unm_init_pushing_force")
    private Float initPushingForce;
    @NonNull()
    @Column(name = "unm_is_active")
    private Boolean isActive;

}
