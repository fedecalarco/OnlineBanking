/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.daos;

import com.banco.model.Cuenta;

/**
 *
 * @author fedec
 */
public interface BankDAO {

    Cuenta getCuentaById(long nroCuenta);

    void update(Cuenta cuenta);

}
