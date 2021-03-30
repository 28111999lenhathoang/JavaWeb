package com.example.myspring1.controller;

import com.example.myspring1.entity.Product;
import com.example.myspring1.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    //step 2: call instance of model(javabean)
    @Autowired//Dependency injection aka DI
    ProductModel productModel;
    //step 1
    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public String createProduct(@ModelAttribute Product product ){
        //step 3
        return "product-form";
    }
    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute Product product, Model model ){
        //The same request.setAttribute("key", value)||session.setAttribute("key",value)
        //step 3
        model.addAttribute("product", product);
        return "save-success";
    }
}
