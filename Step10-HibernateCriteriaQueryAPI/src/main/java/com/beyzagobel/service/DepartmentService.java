package com.beyzagobel.service;

import com.beyzagobel.dao.DepartmentDAO;
import com.beyzagobel.dao.MainDAO;
import com.beyzagobel.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true,rollbackFor = Exception.class)
public class DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Autowired
    private MainDAO mainDAO;

    @Transactional(readOnly = false)
    public List<Department> loadAllDepartment() {
        List<Department> departmentList = departmentDAO.loadAllDepartment();
        return departmentList;
    }

    @Transactional(readOnly = false)
    public Boolean saveOrUpdateDepartment(Long departmentId, String departmentName) {
        Department department;
        if(departmentId != null){
            department = loadDepartment(departmentId);
        }
        else{
            department = new Department();
        }
        department.setDepartmentName(departmentName);
        Boolean success = mainDAO.saveOrUpdateObject(department);
        return success;
    }

    @Transactional(readOnly = false)
    public Boolean deleteDepartment(Long departmentId){

        Department department = loadDepartment(departmentId);
        Boolean success = mainDAO.deleteObject(department);
        return success;
    }

    @Transactional(readOnly = false)
    public Department loadDepartment(Long departmentId){

        Department department = (Department) mainDAO.loadObject(Department.class,departmentId);
        return department;
    }
}
