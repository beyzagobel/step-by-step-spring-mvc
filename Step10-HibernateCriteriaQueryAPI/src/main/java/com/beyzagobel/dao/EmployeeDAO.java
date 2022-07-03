package com.beyzagobel.dao;

import com.beyzagobel.model.Department;
import com.beyzagobel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession () {
        return sessionFactory.getCurrentSession();
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


    public List<Employee> employeesOfDepartments(Long departmentId) {
        Session currentSession = getCurrentSession();
        CriteriaBuilder builder = currentSession.getCriteriaBuilder();
        CriteriaQuery<Employee> cQuery = builder.createQuery(Employee.class);
        Root<Employee> employeeRoot = cQuery.from(Employee.class);

        Predicate predicate = builder.equal(employeeRoot.get("department").get("departmentId"),departmentId);

        cQuery.select(employeeRoot).where(predicate);
        Query query = currentSession.createQuery(cQuery);
        List<Employee> employeeList = query.getResultList();
        return employeeList;

    }
}
