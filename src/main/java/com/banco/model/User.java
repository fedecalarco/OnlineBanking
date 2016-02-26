package com.banco.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long userId;
    private String username;
    private String password;
    private String email;
    @OneToOne(cascade = {CascadeType.ALL})
    private Persona persona;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cuenta cuenta;

    // Spring security
    @Enumerated(EnumType.STRING)
    private User_Role role;

    
    public User() {
    }

    public User(long userId, String username, String password, String email, Persona persona, Cuenta cuenta, User_Role role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.persona = persona;
        this.cuenta = cuenta;
        this.role = role;
    }



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public User_Role getRole() {
        return role;
    }

    public void setRole(User_Role role) {
        this.role = role;
    }

}
