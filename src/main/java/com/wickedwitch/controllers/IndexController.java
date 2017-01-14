package com.wickedwitch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZuZ on 2017-01-10.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String requestIndex(){
        return "index";
    }
}
