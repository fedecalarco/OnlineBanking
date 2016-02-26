/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.model.Movimientos;

/**
 *
 * @author fedec
 */
public interface MovimientosService {

    Movimientos setMovimiento(String operacion, long id, double dinero);
    
}
