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
@Transactional(propagation = Propagation.REQUIRED,readOnly = true)  // sadece okunabilir
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

   @Transactional(readOnly = false)  // veri yazılabilir
    public Boolean saveEmployee(Long employeeId,String fname,String lname,int gender,String bdate){

       Employee employee = new Employee();
       employee.setFname(fname);
       employee.setLname(lname);
       employee.setGender(gender);
       Date bidate = null;
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       try{
           bidate = sdf.parse(bdate);
       }catch (ParseException e){
           e.printStackTrace();
       }
       employee.setBdate(bidate);

       Boolean success = employeeDAO.saveEmployee(employee);
       return success;
    }



}
