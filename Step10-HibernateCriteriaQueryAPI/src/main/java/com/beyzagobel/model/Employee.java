package com.beyzagobel.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "employee")
public class Employee {

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

    @Column(name = "price")
    private Double price;

    // @Transient : Sadece Java sınıfı tarafından kullanılır, veritabanında bir karşılığı yoktur
    @Transient
    private String fnameLname;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
}
