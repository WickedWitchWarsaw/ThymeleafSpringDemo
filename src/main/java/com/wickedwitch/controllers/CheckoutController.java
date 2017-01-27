package com.wickedwitch.controllers;

import com.wickedwitch.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by ZuZ on 2017-01-23.
 */
@Controller
public class CheckoutController {

    @RequestMapping("/checkout")
    public String checkoutForm(Model model) {

        model.addAttribute("checkoutCommand", new CheckoutCommand());

        return "checkoutform";
    }

    @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
