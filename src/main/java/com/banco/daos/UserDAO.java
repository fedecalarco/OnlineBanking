/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.daos;

import com.banco.model.User;
import java.util.List;

/**
 *
 * @author fedec
 */
public interface UserDAO  {

    void create(User user);

    void delete(User user);


    void update(User user);
    
    User getUserByUsername(String username);
    User getUserById(long id);
    
     List<User> getAll();
    
}
