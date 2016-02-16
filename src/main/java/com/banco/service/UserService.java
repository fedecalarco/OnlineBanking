/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.service;

import com.banco.model.User;

/**
 *
 * @author fedec
 */
public interface UserService {

    void create(User user);
    User getUserByUsername(String username);
    
}
