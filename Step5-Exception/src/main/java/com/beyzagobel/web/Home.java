package com.beyzagobel.web;

import com.beyzagobel.exception.ResourceNotFoudException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.module.ResolutionException;


// Controller Sınıfı

@Controller
public class Home {


    @GetMapping(value = "/index")
    public void  login (){

        throw new ResourceNotFoudException();

    }



}
