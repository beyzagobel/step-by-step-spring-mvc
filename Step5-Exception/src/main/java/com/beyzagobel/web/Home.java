package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Home {

    @GetMapping(value = "/index")
    public String  index (){
        return "index";
    }

    @PostMapping(value = "/index2")
    public String  index2 (@RequestParam int sayi1, @RequestParam int sayi2, Model model){

        int bolum = sayi1/sayi2 ; // sayi2 yani bölüm 0 ise ArithmeticException yani RuntimeException fırlatır
        model.addAttribute("bolum",bolum);
        return "index2";
    }









}
