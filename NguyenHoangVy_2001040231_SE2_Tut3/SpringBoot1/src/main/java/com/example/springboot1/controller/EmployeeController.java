package com.example.springboot1.controller;

import com.example.springboot1.model.Employee;
import com.example.springboot1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "")
@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/getAll")
    public String getAllEmployee(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @RequestMapping("/{id}")
    public String getEmployeeById(
            @PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee", employee);
        return "employeeDetail";
    }

    @RequestMapping(value = "/add")
    public String addEmployee (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @RequestMapping (value = "/update/{id}")
    public String updateEmployee(
            @PathVariable (value = "id") Long id, Model model)  {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute(employee);
        return "employeeUpdate";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(
            @RequestParam(value = "id", required = false) Long id, Employee employee, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            if (id == null) {
                return "employeeAdd";
            }
            else {
                return "employeeUpdate";
            }
        }
        employee.setId(id);
        employeeRepository.save(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteEmployee(
            @PathVariable(value = "id") Long id) {
        Employee employee = employeeRepository.getById(id);
        employeeRepository.delete(employee);
        return "redirect:/";
    }
}

