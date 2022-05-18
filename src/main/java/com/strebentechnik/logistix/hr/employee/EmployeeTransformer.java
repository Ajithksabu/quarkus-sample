package com.strebentechnik.logistix.hr.employee;

import java.util.List;

import com.strebentechnik.logistix.hr.util.QuarkusMappingConfig;

import org.mapstruct.Mapper;

@Mapper(config = QuarkusMappingConfig.class)
public interface EmployeeTransformer {

    Employee toResource(EmployeeEntity employeeEntity);

    List<Employee> map(List<EmployeeEntity> employeeEntityList);

    EmployeeEntity toEntity(Employee employee);

}
