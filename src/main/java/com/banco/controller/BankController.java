/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.User;
import com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Training.AAFLP.14
 */
@Controller
@RequestMapping(value = "/HB")
public class BankController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public String registrar(Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        System.out.println(name);
        User u = userService.getUserByUsername(name);
        
        model.addAttribute("session_user", u);
        return "home";
    }

}
