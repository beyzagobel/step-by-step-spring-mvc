package com.beyzagobel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    MessageSource messageSource; // bağımlılık eklenir

    @GetMapping(value = "/")
    public String home(Locale locale, Model model){

        model.addAttribute("baslik",messageSource.getMessage("baslik",null, locale));
        model.addAttribute("locale",locale);
        return "home";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";

    }

}
