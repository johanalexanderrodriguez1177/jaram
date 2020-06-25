package com.soaint.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="l_state")
@ApiModel("Modelo => Estados")
public class State {

    @Id
    @NotNull
    @ApiModelProperty(value = "Campo id autoincrementable", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Campo estado", required = true)
    @Column(name="name")
    private String name;

    @NotNull
    @ApiModelProperty(value = "Campo de relación con tabla pais", required = true)
    @ManyToOne
    @JoinColumn(name="country_id")
    Country country_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(id, state.id) &&
                Objects.equals(name, state.name) &&
                Objects.equals(country_id, state.country_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country_id);
    }


}