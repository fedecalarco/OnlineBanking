/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author fedec
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model m) {

       Authentication auth = SecurityContextHolder.getContext().getAuthentication();
       String name = auth.getName(); //get logged in username

       System.out.println(name);
//        m.addAttribute("session_user", user);
        return "home";
    }

// pageContext.request.remoteUser
}
