package com.wickedwitch.controllers;

import com.wickedwitch.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZuZ on 2017-01-10.
 */
@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/index")
    public String requestIndex(Model model){
        model.addAttribute("products", productService.listProducts());
        return "index";
    }
}
