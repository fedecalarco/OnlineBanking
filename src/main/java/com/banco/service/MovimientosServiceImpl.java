/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.model.Movimientos;
import java.util.Date;

/**
 *
 * @author fedec
 */
public class MovimientosServiceImpl implements MovimientosService {

    
    

    @Override
    public Movimientos setMovimiento(String operacion) {
        
        Movimientos movs = new Movimientos();
        Date dia = new Date();
        
        switch (operacion) {
            case "Registro":
                movs.setAccion("Creacion de cuenta");
                movs.setFecha(dia.toString());
                break;
            case "Deposito":
                movs.setAccion("Deposito");
                movs.setFecha(dia.toString());
                break;
            default: 
                movs.setAccion("OP desconocida");
                movs.setFecha(dia.toString());
                break;
        }

        return movs;
    }

}
