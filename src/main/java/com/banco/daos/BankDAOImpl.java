/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.daos;

import com.banco.model.Cuenta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fedec
 */
@Repository
public class BankDAOImpl implements BankDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Cuenta getCuentaById(long nroCuenta) {
        return (Cuenta) getCurrentSession().createQuery("FROM com.banco.model.Cuenta WHERE cuentaId='" + nroCuenta + "'").uniqueResult();

    }

    @Override
    public void update(Cuenta cuenta) {
        getCurrentSession().update(cuenta);
    }

}
