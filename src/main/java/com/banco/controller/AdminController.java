/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.controller;

import com.banco.model.User;
import com.banco.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author fedec
 */
@Controller
@RequestMapping(value = "/HB/Admin")
@SessionAttributes({"session_user"})
public class AdminController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/Usuarios")
    public String administrarUsuarios(Model m) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        User user = userService.getUserByUsername(name);
        m.addAttribute("session_user", user);
        m.addAttribute("lst", userService.getAll());
        return "admin_usuarios";
    }

    //  Toma el ID del user a modificar y lo busca en la bd para enviarlo a la vista edit
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id") long id, Model m) {
        m.addAttribute("user", userService.getUserById(id));
        return "admin_usuarios_edit";
    }

    // Recibe los atributos del user modificado y los actualiza en la bd 
    // *** MOVER A UN CONTROLLER DE ADMIN *** 
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "Usuario") User user, HttpSession session) {
        User aux = userService.getUserById(user.getUserId());

        aux.setUsername(user.getUsername());
        aux.setPassword(user.getPassword());
        aux.setEmail(user.getEmail());
        aux.getCuenta().setSaldo(user.getCuenta().getSaldo());

        userService.update(aux);
        return "redirect:/HB/Admin/Usuarios";
    }

    // REMOVE
    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") long id, Model m) {

        User user = userService.getUserById(id);
        userService.delete(user);
        return "redirect:/HB/Admin/Usuarios";
    }

}
