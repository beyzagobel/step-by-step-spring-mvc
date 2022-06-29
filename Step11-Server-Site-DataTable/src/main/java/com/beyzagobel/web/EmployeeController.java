package com.beyzagobel.web;

import com.beyzagobel.model.Employee;
import com.beyzagobel.service.EmployeeService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

   /* @GetMapping(value = "/employees")
    public String deneme(Model model){
        return "employee";
    }

    */

    @PostMapping(value = "/employees")
    public @ResponseBody String employees(@RequestParam("draw") int draw,@RequestParam("start") int start,
                                          @RequestParam("length") int length){


        JSONArray jsonArray = employeeService.loadEmployee(start,length);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("draw",draw);
        jsonObject.put("data",jsonArray);
        return jsonObject.toString();

    }


}
