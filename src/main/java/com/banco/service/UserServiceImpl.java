/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banco.daos.UserDAO;
import com.banco.model.Cuenta;
import com.banco.model.User_Role;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fedec
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    // @Autowired
    private MovimientosService mov = new MovimientosServiceImpl();

    @Override
    public void create(User user) {

        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(0);
        cuenta.agregarMovimiento(mov.setMovimiento("Registro"));
        user.setCuenta(cuenta);
        
        user.setRole(User_Role.ROLE_USER);

        userDao.create(user);
    }

    @Override
    public User getUserByUsername(String username) {

        return userDao.getUserByUsername(username);
    }

}
