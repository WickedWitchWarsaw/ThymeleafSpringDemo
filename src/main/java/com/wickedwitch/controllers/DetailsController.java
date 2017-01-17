package com.wickedwitch.controllers;

import com.wickedwitch.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ZuZ on 2017-01-10.
 */
@Controller
public class DetailsController {

    private ProductService productService;

    //Setter based injection
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/details")
    public String requestDetails(){
        return "redirect:/index";
    }


    @RequestMapping("/details/{id}")
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "details";
    }

}
