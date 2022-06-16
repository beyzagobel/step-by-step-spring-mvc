package com.beyzagobel.web;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/loginKontrol")
    public @ResponseBody String loginKontrol(@RequestParam String email,@RequestParam String password,
                                             HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        if(email.equals("") && password.equals("")) {
            jsonObject.put("success",false);
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("email",email);
            jsonObject.put("success",true);
        }
        return jsonObject.toString();

    }

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "welcome";
    }
}
