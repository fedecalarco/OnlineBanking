/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.Cuenta;
import com.banco.model.User;
import com.banco.service.BankService;
import com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Training.AAFLP.14
 */
@Controller
@RequestMapping(value = "/HB")
@SessionAttributes({"session_user"})
public class BankController {

    @Autowired
    UserService userService;
    @Autowired
    BankService bankService;

    @RequestMapping(value = "/index")
    public String registrar(Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        User user = userService.getUserByUsername(name);

        model.addAttribute("session_user", user);
        return "home";
    }

    @RequestMapping(value = "/transferencias", method = RequestMethod.GET)
    public String transferencia() {
        return "home_transferencias";
    }

    @RequestMapping(value = "/transferencias", method = RequestMethod.POST)
    public String transferenciaPost(
            @RequestParam("nroCuentaOrigen") long nroCuentaOrigen,
            @RequestParam("nroCuentaDestino") long nroCuentaDestino,
            @RequestParam("dinero") float dinero,
            Model m
    ) {
        Cuenta cuentaOrigen = bankService.getCuentaById(nroCuentaOrigen);
        Cuenta cuentaDestino = bankService.getCuentaById(nroCuentaDestino);
        if (bankService.transferencia(cuentaOrigen, cuentaDestino, dinero)) {
            m.addAttribute("ok", "Exito");
        } else {
            m.addAttribute("ok", "Fail");
        }
        return "home_transferencias";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "newjsp";
    }

}
