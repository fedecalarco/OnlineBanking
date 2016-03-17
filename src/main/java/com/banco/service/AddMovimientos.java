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
public class AddMovimientos {

     public static Movimientos setMovimiento(String operacion, long id, double dinero) {

        Movimientos movs = new Movimientos();
        Date dia = new Date();
        movs.setFecha(dia.toString());

        switch (operacion) {
            case "Registro":
                movs.setAccion("Creacion de cuenta");
                break;
            case "Envio_Transferencia":
                movs.setAccion("Trasferencia: Envio $" + dinero + " a cuenta Nº " + id);
                break;
            case "Recibio_Transferencia":
                movs.setAccion("Trasferencia: Recibio $" + dinero + " " + "de cuenta Nº " + id);
                break;
            default:
                movs.setAccion("OP desconocida");
                break;
        }

        return movs;
    }

}
