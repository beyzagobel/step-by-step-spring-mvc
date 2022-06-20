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

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional(readOnly = false)
    public Boolean saveOrUpdateEmployee(Long employeeId,String fname,String lname,int gender,String bdate){

        Employee employee = null;

        if(employeeId != null ){
            employee = (Employee) employeeDAO.loadEmployee(Employee.class,employeeId);
        }
        else{
            employee = new Employee();
        }
        employee.setFname(fname);
        employee.setLname(lname);
        employee.setGender(gender);

        Date bidate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("gg-aaa-yyyy");
        try{
            bidate = sdf.parse(bdate);
        } catch (ParseException e){
            e.getErrorOffset();
        }
        employee.setBdate(bidate);
        Boolean success = employeeDAO.saveOrUpdateEmployee(employee);
        return success;
    }


}
