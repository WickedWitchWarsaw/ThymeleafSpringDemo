package com.wickedwitch.controllers;

import com.wickedwitch.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by ZuZ on 2017-01-27.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String requestLogin(Model model){
        model.addAttribute("loginCommand", new LoginCommand());
        return "login";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "login";
        }
        return "redirect:index";
    }
}
