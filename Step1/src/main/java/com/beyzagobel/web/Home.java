package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home  {

    @GetMapping(value = "/index")
    public String handle(Model model){

        /*
         * Model Sınıfı : Controller sınıfında bulunan metoslarda tanımlanarak view katmanına direk veri taşırlar.
         */
        model.addAttribute("message","Hello World!");

        return "index";

    }
}
