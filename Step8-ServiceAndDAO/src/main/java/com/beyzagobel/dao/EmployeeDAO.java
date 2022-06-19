package com.beyzagobel.dao;

import com.beyzagobel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public class EmployeeDAO {

    /*
     * SessionFactory, nesnelerin depolanmasından ve veritabanına yüklenmesinden sorumludur.
     * Spring ile Hibernate arasında çalışma zamanı arayüzüdür.
     * Sunduğu metodlar : save(Object),load(Object), get(Object, Id),flush(), getCriteriaBuilder() .
     */
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return  sessionFactory.getCurrentSession();
    }

    // Veritabanına kaydetme işlemini sağlayan dao
    public Boolean saveEmployee(Employee employee){
        boolean success = true;
        try{
            Serializable s = getCurrentSession().save(employee);  // SessionFactory'nin save metodu ile nesneler kaydedilir.
        }catch (Exception e){
            e.printStackTrace();
            success = false ;
        }
        return success ;
    }
}
