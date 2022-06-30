package com.beyzagobel.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(nullable = false )
    private String fname;

    @Column(nullable = false)
    private String lname;

    @Temporal(TemporalType.DATE)
    private Date bdate;

    @Column(name = "gender")
    private int gender;

    @Column(name = "salary")
    private Double salary;

    // @Transient : Sadece Java sınıfı tarafından kullanılır, veritabanında bir karşılığı yoktur
    @Transient
    private String fnameLname;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double price) {
        this.salary = price;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getFnameLname() {
        return fnameLname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
