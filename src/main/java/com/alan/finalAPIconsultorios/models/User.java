package com.alan.finalAPIconsultorios.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends SharedInfo{


    @Column(name="Status")
    private Integer status;

    @Column(name="Name")
    private String name;

    @Column(name="Lastname")
    private String lastName;

    @Column(name="Surname")
    private String surname;

    @Column(name="Email")
    private String email;

    @Column(name="Role")
    private Integer role;

    @Column(name="Username")
    private String username;


    public User(Integer status, String name, String lastName, String surname, String email, Integer role, String username) {
        this.status = status;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.email = email;
        this.role = role;
        this.username = username;
    }

    public User(){}


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
