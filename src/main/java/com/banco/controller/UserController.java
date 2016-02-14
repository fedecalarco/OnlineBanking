/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.User;
import com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Training.AAFLP.14
 */

@Controller
@RequestMapping(value="/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value="/registrar", method = RequestMethod.GET)
    public String registrar (Model model){
        return "registrar";
    }
    @RequestMapping(value="/registrar",method = RequestMethod.POST)
    public String registrar(@ModelAttribute(value = "Usuario") User user, Model model){
        // Verificar si username ^ email no existan

        userService.create(user);
        return "redirect:/HB/index";
    }
    
}
