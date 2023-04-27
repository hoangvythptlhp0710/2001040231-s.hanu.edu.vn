package com.example.springboot3.controller;

import com.example.springboot3.model.Employee;
import com.example.springboot3.repository.CompanyRepository;
import com.example.springboot3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeRepository.getById(id);
    }


    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee updateEmployee = employeeRepository.getById(id);
        if (updateEmployee != null) {
            updateEmployee.setName(employee.getName());
            updateEmployee.setAge(employee.getAge());
            updateEmployee.setCompany(employee.getCompany());
            updateEmployee.setAddress(employee.getAddress());
            updateEmployee.setImage(employee.getImage());
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteEmployeeById(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }

    @GetMapping("/sort/asc")
    public List<Employee> sortAsc() {
        return employeeRepository.findAll().stream().sorted().collect(Collectors.toList());
    }

    @GetMapping("/sort/desc")
    public List<Employee> sortDsc() {
        return employeeRepository.findAll().stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
    }

}
