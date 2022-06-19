package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home  {

    @GetMapping(value = "/index")
    public String handle(Model model){ 
        
         model.addAttribute("message","Hello World!");
        /*
         * Model Sınıfı : Controller sınıfında bulunan metodlarda tanımlanarak view katmanına key-value olarak direk veri taşırlar.
         */
        return "index";  // index.jsp view'2 return edilir.

    }
}
