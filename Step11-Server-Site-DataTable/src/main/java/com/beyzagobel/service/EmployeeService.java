package com.beyzagobel.service;

import com.beyzagobel.dao.EmployeeDAO;
import com.beyzagobel.model.Employee;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly =true,rollbackFor = Exception.class)
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;


    public List<Employee> loadAllEmployees() {
        List<Employee> employeeList = employeeDAO.loadAllEmployees();
        return employeeList;
    }

    public JSONArray loadEmployee(int start, int length) {
        List<Employee> employeeList = employeeDAO.loadEmployee(start,length);
        JSONArray jsonArray = new JSONArray();
        for(int i = 0 ; i < employeeList.size() ; i++){
            JSONObject jsonObject = new JSONObject();
            Employee employee = employeeList.get(i);
            jsonObject.put("employeeId",employee.getEmployeeId());
            jsonObject.put("fname",employee.getFname());
            jsonArray.add(i,jsonArray);
        }
        return jsonArray;
    }


}
