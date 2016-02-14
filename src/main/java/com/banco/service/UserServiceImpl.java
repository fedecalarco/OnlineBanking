/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.DAO.UserDAO;
import com.banco.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fedec
 */
@Service
public class UserServiceImpl implements UserService {

    //@Autowired
//    private UserDAO userDao;
    
   // @Autowired
  //  private MovimientosServiceImpl mov;
    
    @Override
    public void create(User user) {
      //  user.getCuenta().agregarMovimiento(mov.setMovimiento("Registro"));
        //userDao.create(user);
    }

}
