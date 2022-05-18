package com.strebentechnik.logistix.hr.employee;

import java.sql.Timestamp;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Employee {

  private Long id;

  private String organization;
  
  private String code;
  private String name;
  private String shortName;
  private String designation;
  private String notes;
  private Boolean status;
  private String createdBy;
  private String updatedBy;
  private Timestamp createdAt;
  private Timestamp updatedAt;
}
