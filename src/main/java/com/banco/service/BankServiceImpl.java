/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.daos.BankDAO;
import com.banco.model.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fedec
 */
@Service
@Transactional
public class BankServiceImpl implements BankService {

    @Autowired
    private BankDAO bankDao;
    
    private MovimientosService movimientosService = new MovimientosServiceImpl();
    

    private boolean quitarSaldo(Cuenta cuenta, float saldo) {
        if (cuenta.getSaldo() >= saldo) {
            cuenta.setSaldo(cuenta.getSaldo() - saldo);
            return true;
        } else {
            // Saldo insuficiente
            return false;
        }
    }

    private void depositarSaldo(Cuenta cuenta, float saldo) {
        cuenta.setSaldo(cuenta.getSaldo() + saldo);
    }

    @Override
    public boolean transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, float dinero) {
        // Descuento a saldo a cuenta origen 
        if (quitarSaldo(cuentaOrigen, dinero)) {
            
            depositarSaldo(cuentaDestino, dinero);
            // Agrego los movimientos realizados a la la lista 
            cuentaOrigen.agregarMovimiento(movimientosService.setMovimiento("Envio_Transferencia", cuentaDestino.getId(), dinero));
            cuentaDestino.agregarMovimiento(movimientosService.setMovimiento("Recibio_Transferencia", cuentaOrigen.getId(),dinero));  
            // Update cuentas 
            bankDao.update(cuentaOrigen);
            bankDao.update(cuentaDestino);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Cuenta getCuentaById(long nroCuenta) {
        return bankDao.getCuentaById(nroCuenta);
    }

}
