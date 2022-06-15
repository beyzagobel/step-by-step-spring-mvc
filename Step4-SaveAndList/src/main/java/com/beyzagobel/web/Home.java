package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Controller Sınıfı

@Controller
public class Home {

    @GetMapping(value = "/kaydet")
    public String kaydet(){
        return "kaydet";
    }

    /*
     * kaydet.jsp formundan gelen verileri parametre olarak controllerda karşıladık ve listele.jsp view'ına gönderdik.
     */
    @PostMapping(value = "/listele")
    public  String listele(@RequestParam String isim,@RequestParam String soyisim,
                          @RequestParam int cinsiyet,@RequestParam int sinif,Model model){


        model.addAttribute("isim",isim);
        model.addAttribute("soyisim",soyisim);
        model.addAttribute("cinsiyet",cinsiyet);
        model.addAttribute("sinif",sinif);

        return "listele";

    }



}
