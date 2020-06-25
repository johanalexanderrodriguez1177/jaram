package com.soaint.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="users")
@ApiModel("Modelo => Usuarios")
public class Users {

    @Id
    @NotNull
    @ApiModelProperty(value = "Campo id autoincrementable", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Campo correo", required = true)
    @Column(name="email")
    private String email;

    @NotNull
    @ApiModelProperty(value = "Campo contraseña", required = true)
    @Column(name="password")
    private String password;

    @ApiModelProperty(value = "Campo id autoincrementable")
    @Column(name="remember_token")
    private String remember_token;

    @ApiModelProperty(value = "Campo de fecha creación")
    @Column(name="created_at")
    private String created_at;

    @ApiModelProperty(value = "Campo de fecha actualización")
    @Column(name="update_at")
    private String update_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) &&
                Objects.equals(email, users.email) &&
                Objects.equals(password, users.password) &&
                Objects.equals(remember_token, users.remember_token) &&
                Objects.equals(created_at, users.created_at) &&
                Objects.equals(update_at, users.update_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, remember_token, created_at, update_at);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", remember_token='" + remember_token + '\'' +
                ", created_at='" + created_at + '\'' +
                ", update_at='" + update_at + '\'' +
                '}';
    }
}