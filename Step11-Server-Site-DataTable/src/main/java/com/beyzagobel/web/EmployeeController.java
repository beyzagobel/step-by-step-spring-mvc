package com.beyzagobel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping(value = "/")
    public String deneme(){
        return "deneme";
    }
}
