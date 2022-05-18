package com.strebentechnik.logistix.hr.employee;

import java.sql.Timestamp;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "employees")
public class EmployeeEntity extends PanacheEntity {

    public String organization;

    public String code;
    public String name;
    public String shortName;
    public String designation;
    public String notes;
    public Boolean status;
    public String createdBy;
    public String updatedBy;
    public Timestamp createdAt;
    public Timestamp updatedAt;

}
