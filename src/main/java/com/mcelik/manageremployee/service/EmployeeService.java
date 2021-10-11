package com.mcelik.manageremployee.service;

import com.mcelik.manageremployee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

     Employee saveEmployee(Employee employee);

     List<Employee> findAllEmployee();

     Employee updateEmployee(Employee employee);

      void deleteEmployee(Long id);

      Employee findEmployeeById(Long id);
}
