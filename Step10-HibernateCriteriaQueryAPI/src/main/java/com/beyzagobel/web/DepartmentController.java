package com.beyzagobel.web;

import com.beyzagobel.model.Department;
import com.beyzagobel.service.DepartmentService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/department")
    public String department(Model model){
        List<Department> departmentList = departmentService.loadAllDepartment();
        model.addAttribute("departmentList",departmentList);
        return "department";
    }

    @GetMapping(value = "/saveOrUpdateDepartment")
    public String saveOrUpdateDepartment(){
        return "saveOrUpdateDepartment";
    }
    @PostMapping("/saveOrUpdateDepartment")
    public @ResponseBody String saveOrUpdateDepartment(@RequestParam(value = "departmentId",required = false) Long departmentId,
                                                       @RequestParam String departmentName){
        Boolean success = departmentService.saveOrUpdateDepartment(departmentId,departmentName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",success);
        return jsonObject.toString();
    }

    @PostMapping(value = "/deleteDepartment")
    public Boolean deleteDepartment(@RequestParam("id") Long departmentId){
        Boolean success = departmentService.deleteDepartment(departmentId);
        return success;
    }

    @GetMapping(value = "/loadDepartment/{departmentId}")
    public String loadDepartment(@PathVariable("departmentId") Long departmentId,Model model){
        Department department = departmentService.loadDepartment(departmentId);
        model.addAttribute("department",department);
        return "saveOrUpdateDepartment";
    }

}
