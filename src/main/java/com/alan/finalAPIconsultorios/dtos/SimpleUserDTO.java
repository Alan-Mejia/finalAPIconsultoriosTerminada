package com.alan.finalAPIconsultorios.dtos;

import javax.persistence.Column;

public class SimpleUserDTO {
    @Column(name="Username")
    private String username;


    @Column(name="Email")
    private String email;

    public SimpleUserDTO(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public  SimpleUserDTO(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
