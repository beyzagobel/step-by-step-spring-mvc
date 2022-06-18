package com.beyzagobel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    MessageSource messageSource;

    @GetMapping(value = "/anasayfa")
    public String home(Locale locale, Model model, HttpServletRequest request,
                       HttpServletResponse response){

        model.addAttribute("karsilama",messageSource.getMessage("karsilama",null, locale));
        return "home";
    }

}
