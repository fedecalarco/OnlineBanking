package com.banco.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    @Column(name = "STATE", nullable = false)
    private String state = State.ACTIVE.getState();
    
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

    public User() {
    }

    public User(long userId, String username, String password, String email, Persona persona, Cuenta cuenta) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.persona = persona;
        this.cuenta = cuenta;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }
    
    

    
}
