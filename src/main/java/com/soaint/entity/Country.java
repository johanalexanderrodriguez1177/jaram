package com.soaint.entity;

    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;

    import javax.persistence.*;
    import javax.validation.constraints.NotNull;
    import java.util.Objects;

@Entity
@Table(name="l_country")
@ApiModel("Modelo => Pais")
public class Country {

    @Id
    @NotNull
    @ApiModelProperty(value = "Campo id autoincrementable", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Campo pais", required = true)
    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}