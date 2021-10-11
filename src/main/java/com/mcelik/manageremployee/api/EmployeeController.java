package com.mcelik.manageremployee.api;

import com.mcelik.manageremployee.model.Employee;
import com.mcelik.manageremployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employeeList = employeeService.findAllEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee employeeSave = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employeeSave, HttpStatus.CREATED);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee employeeUpdate = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(employeeUpdate, HttpStatus.OK);
    }

    @PostMapping(value = "/get/{id}")
    public ResponseEntity<Employee> getFindEmployee(@PathVariable("id") Long id) {
        Employee employeeUpdate = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employeeUpdate, HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> getDeleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
