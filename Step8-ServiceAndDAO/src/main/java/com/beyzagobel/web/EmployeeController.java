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
    public String index(){
        return "employee";
    }

    @PostMapping(value = "/kaydet")
    public @ResponseBody String kaydet(@RequestParam(value = "employeeId",required = false) Long employeeId,@RequestParam String fname, @RequestParam String lname,
                                       @RequestParam int gender,@RequestParam String bdate){

        Boolean success = employeeService.saveEmployee(employeeId,fname,lname,gender,bdate);
        JSONObject jsonObject = new JSONObject();
        if(fname.equals("") && lname.equals("") && bdate.equals("")){
            jsonObject.put("success",success);
        }

        jsonObject.put("success",success);
        return jsonObject.toString();
    }

    @GetMapping(value = "/welcomeEmployee")
    public String welcomeEmployee(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.get("fname");
        return "welcomeEmployee";
    }


}
