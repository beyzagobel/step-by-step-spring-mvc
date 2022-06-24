package com.beyzagobel.service;


import com.beyzagobel.dao.EmployeeDAO;
import com.beyzagobel.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true,rollbackFor = Exception.class)
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional(readOnly = false)
    public Boolean saveOrUpdateEmployee(Long employeeId,String fname,String lname,int gender,String bdate){

        Employee employee ;

        if(employeeId != null){
            employee = loadEmployee(employeeId);
        }
        else{
            employee = new Employee();
        }
        employee.setFname(fname);
        employee.setLname(lname);
        employee.setGender(gender);

        Date bidate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            bidate = sdf.parse(bdate);
        } catch (ParseException e){
            e.printStackTrace();
        }
        employee.setBdate(bidate);
        Boolean success = employeeDAO.saveOrUpdateEmployee(employee);
        return success;
    }

    @Transactional(readOnly = false)
    public Boolean deleteEmployee(Long employeeId){
        Employee employee = loadEmployee(employeeId);
        Boolean success = employeeDAO.deleteEmployee(employee);
        return success;
    }

   public Employee loadEmployee(Long employeeId){
        Employee employee = (Employee) employeeDAO.loadEmployee(Employee.class,employeeId);
        return  employee;
    }


    public List<Employee> loadEmployess(){
        List<Employee> employeeList = employeeDAO.loadEmployees();
        return employeeList;
    }



}
