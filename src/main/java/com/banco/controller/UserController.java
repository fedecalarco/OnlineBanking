/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.User;
import com.banco.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Training.AAFLP.14
 */

@Controller
@RequestMapping(value="/user")
public class UserController {
    
    @RequestMapping(value="/registrar", method = RequestMethod.GET)
    public String registrar (){
        return "registrar";
    }
    @RequestMapping(value="/registrar",method = RequestMethod.POST)
    public String registrar(@ModelAttribute(value = "Usuario") User user, Model m){
        // Verificar si username ^ email no existan
        UserServiceImpl userService = new UserServiceImpl();
        userService.create(user);
        return "index";
    }
    
}
