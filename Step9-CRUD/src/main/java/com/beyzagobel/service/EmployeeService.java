package com.beyzagobel.service;


import com.beyzagobel.dao.EmployeeDAO;
import com.beyzagobel.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional(readOnly = false)
    public Boolean saveOrUpdateEmployee(Long employeeId,String fname,String lname,int gender,String bdate){

        Employee employee = null;

        Boolean success = employeeDAO.saveOrUpdateEmployee(employee);
        return success;
    }
}
