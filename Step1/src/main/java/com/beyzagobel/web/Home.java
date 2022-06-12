package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home  {

    @GetMapping(value = "/*")
    public String handle(Model model){

        model.addAttribute("mesaj","Hello World!");
        return "index";

    }
}
