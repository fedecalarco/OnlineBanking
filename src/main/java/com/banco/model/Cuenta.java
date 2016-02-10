package com.banco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cuentaId;
    private float saldo;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Movimientos> movimietos = new ArrayList<Movimientos>();

    public Cuenta() {
    }

    public Cuenta(long cuentaId, float saldo) {
        this.cuentaId = cuentaId;
        this.saldo = saldo;
    }
    
  
    public long getId() {
        return cuentaId;
    }

    public void setId(long id) {
        this.cuentaId = id;
    }
    

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public List<Movimientos> getMovimietos() {
        return movimietos;
    }

    public void setMovimietos(List<Movimientos> movimietos) {
        this.movimietos = movimietos;
    }

    
    public void agregarMovimiento(Movimientos mov){
        this.movimietos.add(mov);
    }


}
