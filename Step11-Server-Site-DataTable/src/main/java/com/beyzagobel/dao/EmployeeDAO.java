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

    private Session getCurrentSession () {
        return sessionFactory.getCurrentSession();
    }
    public List<Employee> loadAllEmployees() {
        Session currentSession = getCurrentSession();
        CriteriaBuilder criteriaBuilder = currentSession.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);

        criteriaQuery.select(root);
        Query<Employee> query = currentSession.createQuery(criteriaQuery);
        List<Employee> employeeList = query.getResultList();
        return employeeList;
    }
    public Object loadObject(Class clas , Serializable id){
        return getCurrentSession().get(clas,id);
    }

    public List<Employee> loadEmployee(int start, int length) {
        Session currentSession = getCurrentSession();
        CriteriaBuilder criteriaBuilder = currentSession.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);

        Query<Employee> query = currentSession.createQuery(criteriaQuery);
        query.setFirstResult(start);
        query.setMaxResults(length);
        List<Employee> employeeList = query.getResultList();
        return employeeList;
    }
}
