package com.beyzagobel.dao;


import com.beyzagobel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public Boolean saveOrUpdateEmployee(Employee employee){
        Boolean success = true;
        try {
            Serializable s = getCurrentSession().save(employee);
        }catch (Exception e){
            e.printStackTrace();
            success = false;
        }
        return success;
    }
}
