package com.wickedwitch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZuZ on 2017-02-15.
 */
@Controller
public class SecuredController {

    @RequestMapping("/secured")
    public String getSecured(){
        return "secured";
    }

}
