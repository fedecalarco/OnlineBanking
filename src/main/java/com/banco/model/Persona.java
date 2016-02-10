package com.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

@Entity
public class Persona implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long personaId;
    private String apellido;
    private String dni;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Persona(long personaId, String apellido, String dni, String nombre, String telefono) {
        this.personaId = personaId;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
