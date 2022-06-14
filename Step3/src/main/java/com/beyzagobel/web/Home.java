package com.beyzagobel.web;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.BindException;


// Controller Sınıfı

@Controller
@RequestMapping(value ="/*", method = RequestMethod.GET)  // sınıf seviyesinde opsiyoneldir
public class Home {

    /*
     * @PathVariable : İstek yolu parametresidir. İstek adresindeki URI'lar değişkenlerle eşleştirilir.
     * university.com/beyzagobel   ->  beyzagobel bir PathVariable 'dır.
     */
    @GetMapping(value = "allPersonel/{email}")
    public String personel (Model model, @PathVariable("email") String email){
        model.addAttribute("email",email);
        return "index";

    }

    @GetMapping(value = "/kaydetFormu")
    public String ogrenci(){
        return "kaydet";
    }

    /*
     * Kaydet formuna yazılan ad ve soyad verileri @requestParam annotation'ı le alınır
     * ve istenildiği gibi kullanılabilir ben burada verileri kaydedilen.jsp view'ına göndererek ekrana yazdırdım.
     */
    @PostMapping(value = "/kaydedilen")
    public String kaydedilen(@RequestParam String ad, @RequestParam String soyad,
                             HttpServletRequest req, HttpServletResponse res,
                             Model model){

        model.addAttribute("ad",ad);
        model.addAttribute("soyad",soyad);
        return "kaydedilen";
    }






}
