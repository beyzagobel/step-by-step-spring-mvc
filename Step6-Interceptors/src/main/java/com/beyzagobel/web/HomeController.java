package com.beyzagobel.web;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String login(){
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @PostMapping(value = "/loginKontrol")
    public @ResponseBody String loginKontrol(@RequestParam String email, @RequestParam String password, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        if(email.equals("") && password.equals("")){
            jsonObject.put("success",false);
        }

        HttpSession session = request.getSession();
        session.setAttribute("email",email);
        jsonObject.put("success",true);
        return jsonObject.toString();

    }




}
