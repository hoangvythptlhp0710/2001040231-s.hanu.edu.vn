package com.example.springboot2.controller;

import com.example.springboot2.model.Company;
import com.example.springboot2.model.Employee;
import com.example.springboot2.repository.CompanyRepository;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    @RequestMapping(value = "/{id}")
    public String getCompanyById(@PathVariable Long id, Model model) {
        Company company = companyRepository.getById(id);
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("company", company);
        return "companyDetail";
    }

    @RequestMapping(value = "/list")
    public String getAllCompany(Model model) {
        List<Company> companies = companyRepository.findAll();
        model.addAttribute("companies", companies);
        return "companyList";
    }
}
