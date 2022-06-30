package com.beyzagobel.dao;

import com.beyzagobel.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class DepartmentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession () {
        return sessionFactory.getCurrentSession();
    }

    public List<Department> loadAllDepartment() {
        Session currentSession = getCurrentSession();
        CriteriaBuilder builder =  currentSession.getCriteriaBuilder();
        CriteriaQuery<Department> criteriaQuery = builder.createQuery(Department.class);
        Root<Department> root = criteriaQuery.from(Department.class);
        criteriaQuery.select(root);

        Query<Department> query = currentSession.createQuery(criteriaQuery);
        List<Department> departmentList = query.getResultList();
        return departmentList;
    }

}
