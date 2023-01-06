package com.sofka.spacecraft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name="manned2")
@NoArgsConstructor

public class Manned2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "man_id")
    private Integer id;

    @Column(name = "man_name")
    @NonNull
    @NotEmpty(message = "El nombre no debe estar vacio")
    private String name;

    @Column(name = "man_year")
    @NonNull
    @Digits(integer = 4, fraction = 0, message = "Actualmente los años solo tienen 4 cifras")
    private Integer year;

    @Column(name = "man_country_of_origin")
    @NonNull
    @NotEmpty(message = "El pais de origen no debe estar vacio")
    private String country;

    @Column(name = "man_power")
    @NonNull
    @NotEmpty(message = "El poder no debe estar vacio")
    private String power;

    @Column(name = "man_number_of_crews")
    @NonNull
    @Digits(integer = 1, fraction = 0)
    @Max(value = 2, message = "El valor debe ser entre 0 y 2")
    @Min(value = 0, message = "El valor debe ser entre 0 y 2")
    private Integer ncrew;
}
