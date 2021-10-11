package com.mcelik.manageremployee.repository;

import com.mcelik.manageremployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.rmi.runtime.Log;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeesById(Long id);

     Optional<Employee> findEmployeeById(Long id);
}
