/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.daos;

import com.banco.model.User;

/**
 *
 * @author fedec
 */
public interface UserDAO  {

    void create(User user);

    void delete(User user);

    void remove(User user);

    void update(User user);
    
}
