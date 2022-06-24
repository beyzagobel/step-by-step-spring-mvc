package com.beyzagobel.web;

import com.beyzagobel.model.Employee;
import com.beyzagobel.service.EmployeeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public String employees(Model model){

        List<Employee> employeeList = employeeService.loadEmployess();
        model.addAttribute("employeeList",employeeList);
        return "employees";

    }

    @GetMapping(value = "/saveOrUpdateEmployee")
    public String saveOrUpdateEmployee(){

        return "saveOrUpdateEmployee";

    }

    @PostMapping(value = "/saveOrUpdateEmployee")
    public @ResponseBody String saveOrUpdateEmployee(@RequestParam(required = false,value = "employeeId") Long employeeId,@RequestParam String fname,
                                                     @RequestParam String lname,@RequestParam int gender,@RequestParam String bdate){

        Boolean success = employeeService.saveOrUpdateEmployee(employeeId,fname,lname,gender,bdate);
        JSONObject jsonObject = new JSONObject();

        if(fname.equals("") || lname.equals("") ){
            jsonObject.put("exist",false);
            jsonObject.put("success",success);
        }
        else{
            jsonObject.put("exist",true);
            jsonObject.put("success",success);
        }
        return jsonObject.toString();
    }

    @PostMapping(value = "/deleteEmployee")
    public @ResponseBody String deleteEmployee(@RequestParam("id") Long employeeId){

        Boolean success = employeeService.deleteEmployee(employeeId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",success);
        return jsonObject.toString();

    }

    @GetMapping(value = "/loadEmployee/{employeeId}")
    public String loadEmployee(@PathVariable("employeeId") Long employeeId,Model model){

        Employee employee = employeeService.loadEmployee(employeeId);
        model.addAttribute("employee",employee);
        return "saveOrUpdateEmployee";

    }


}
