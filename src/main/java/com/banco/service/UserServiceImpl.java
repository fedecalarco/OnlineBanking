/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.DAO.UserDAO;
import com.banco.DAO.UserDAOImpl;
import com.banco.model.User;


/**
 *
 * @author fedec
 */

public class UserServiceImpl implements UserService{
 
    public boolean create(User user) {
        boolean ok;
        UserDAO u = new UserDAOImpl();
        try {
            u.create(user);
            ok = true;
        } catch (Exception e) {
            ok=false;
        }
        return ok;
    }
 
}