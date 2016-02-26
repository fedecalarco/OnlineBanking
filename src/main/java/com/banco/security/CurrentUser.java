/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.security;

import com.banco.model.User_Role;
import com.banco.model.User;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 *
 * @author fedec
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User{
    
    private User user;
    
    public CurrentUser(User user){
        super(user.getUsername(),user.getPassword(),AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }
    
    public User getUser(){
        return user;
    }
    
    public User_Role getRole(){
        return user.getRole();
    }
}
