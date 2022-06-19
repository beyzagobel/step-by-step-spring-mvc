package com.beyzagobel.dao;

import com.beyzagobel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return  sessionFactory.getCurrentSession();
    }

    public Boolean saveEmployee(Employee employee){
        boolean success = true;
        try{
            Serializable s = getCurrentSession().save(employee);
        }catch (Exception e){
            e.printStackTrace();
            success = false ;
        }
        return success ;
    }
}
