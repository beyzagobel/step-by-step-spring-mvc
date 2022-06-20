package com.beyzagobel.web;

import com.beyzagobel.service.EmployeeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/")
    public String employee(){
        return "employee";
    }
    @PostMapping(value = "/saveOrUpdateemployee")
    public @ResponseBody String saveOrUpdateEmployee(@RequestParam(required = false) Long employeeId,@RequestParam String fname,
                                                     @RequestParam String lname,@RequestParam int gender,@RequestParam String bdate){

        Boolean success = employeeService.saveOrUpdateEmployee(employeeId,fname,lname,gender,bdate);
        JSONObject jsonObject = new JSONObject();

        return jsonObject.toString();

    }
}
