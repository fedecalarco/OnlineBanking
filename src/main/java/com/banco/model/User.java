package com.banco.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
    
    
    public User() {
    }

    public User(long userId, String email, String password, Persona persona, String username) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.persona = persona;
        this.username = username;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    

}
