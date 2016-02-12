/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fedec
 */
@Controller

public class HomeController {
    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView MV = new ModelAndView("index");
        return MV;
    }
    


}
