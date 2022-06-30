package com.beyzagobel.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public class MainDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public Object loadObject(Class clas, Serializable id){
        return getCurrentSession().get(clas,id);
    }

    public Boolean saveOrUpdateObject(Object object){
        boolean success = true;
        try {
            Serializable s = getCurrentSession().save(object);
        }catch (Exception e){
            e.printStackTrace();
            success = false;
        }
        return success;
    }
    public Boolean deleteObject(Object object){
        boolean success = true;
        try {
            getCurrentSession().remove(object);
        }catch (Exception e){
            e.printStackTrace();
            success = false ;
        }
        return success;
    }
}
