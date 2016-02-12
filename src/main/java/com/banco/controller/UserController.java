/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    
}
