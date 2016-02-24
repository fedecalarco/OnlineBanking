/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.model.Cuenta;

/**
 *
 * @author fedec
 */
public interface BankService {
    public boolean transferencia(Cuenta nroCuentaOrigen, Cuenta nroCuentaDestino, float dinero);
    public Cuenta getCuentaById(long nroCuenta);
}
