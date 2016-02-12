/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.DAO;

import com.banco.model.User;

/**
 *
 * @author Training.AAFLP.14
 */
public interface UserDAO {
    
    
    public void create(User user);
    public void remove(User user);
    public void update(User user);
    public void delete(User user);
    
}
