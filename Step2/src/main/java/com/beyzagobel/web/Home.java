package com.beyzagobel.web;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.JSONString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// Controller Sınıfı

@Controller
public class Home {

    @GetMapping(value = "/index")
    public  String handle(Model model){
        return "index";

    }

}
