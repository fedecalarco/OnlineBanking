/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.DAO.UserDAO;
import com.banco.model.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author fedec
 */
@Service
public class UserService {

    @Resource
    private UserDAO userDao;
    
    MovimientosService mov = new MovimientosService();
    
    public void create(User user) {
        user.getCuenta().agregarMovimiento(mov.setMovimiento("Registro"));
        userDao.create(user);
    }

}
