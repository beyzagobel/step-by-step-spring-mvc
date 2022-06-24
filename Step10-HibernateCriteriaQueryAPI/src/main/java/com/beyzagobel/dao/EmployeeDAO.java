package com.beyzagobel.dao;

import com.beyzagobel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public Object loadEmployee(Class employee,Serializable id){
        return getCurrentSession().get(employee,id);
    }

    public Boolean saveOrUpdateEmployee(Object employee){
        boolean success = true;
        try {
            Serializable s = getCurrentSession().save(employee);
        }catch (Exception e){
            e.printStackTrace();
            success = false;
        }
        return success;
    }
    public Boolean deleteEmployee(Object employee){
        boolean success = true;
        try {
            getCurrentSession().remove(employee);
        }catch (Exception e){
            e.printStackTrace();
            success = false ;
        }
        return success;
    }


    public List<Employee> loadAllEmployee(){
        Session currentSession = getCurrentSession();
        CriteriaBuilder builder = currentSession.getCriteriaBuilder();
        CriteriaQuery<Employee> cQuery = builder.createQuery(Employee.class);
        Root<Employee> root = cQuery.from(Employee.class);
        cQuery.select(root);

        Query<Employee> query = currentSession.createQuery(cQuery);
        List<Employee> employeeList = query.getResultList();
        return employeeList;
    }

}
