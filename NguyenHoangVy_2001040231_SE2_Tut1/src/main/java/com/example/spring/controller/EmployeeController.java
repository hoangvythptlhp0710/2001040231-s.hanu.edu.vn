package com.example.spring.controller;

import com.example.spring.model.Employee;
import com.example.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;


    @RequestMapping(value = "/")
    public String getAllEmployee(Model model) {
        List<Employee> employeeList = employeeRepository.findAll();
        model.addAttribute("employees", employeeList);
        return "employeeList";
    }

    @RequestMapping(value = "/{id}")
    public String getEmployeeById(@PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee", employee);
        return "employeeDetail";
    }

    @RequestMapping(value = "/add")
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "addEmployee";
    }

    @RequestMapping(value = "/update/{id}")
    public String updateEmployee(@PathVariable(value = "id") Long id, @RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "updateEmployee";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id) {
        employeeRepository.deleteById(id);
        return "redirect:/";
    }
}
