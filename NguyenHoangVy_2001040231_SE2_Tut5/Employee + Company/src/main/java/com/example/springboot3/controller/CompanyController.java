package com.example.springboot3.controller;

import com.example.springboot3.model.Company;
import com.example.springboot3.model.Employee;
import com.example.springboot3.repository.CompanyRepository;
import com.example.springboot3.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

//    @RequestMapping(value = "/list")
//    public String getAllCompany(Model model) {
//        List<Company> companies = companyRepository.findAll();
//        model.addAttribute("companies", companies);
//        return "companyList";
//    }

    @GetMapping("/all")
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

//    @RequestMapping(value = "/{id}")
//    public String getCompanyById(
//            @PathVariable(value = "id") Long id, Model model) {
//        Company company = companyRepository.getById(id);
//        List<Employee> employees = employeeRepository.findAll();
//        model.addAttribute("employees", employees);
//        model.addAttribute("company", company);
//        return "companyDetail";
//    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return companyRepository.getById(id);
    }

//    @RequestMapping(value = "/add")
//    public String addCompany (Model model) {
//        Company company = new Company();
//        model.addAttribute("company", company);
//        return "companyAdd";
//    }

    @PostMapping("/add")
    public void addCompany(@RequestBody Company company) {
        companyRepository.save(company);
    }

//    @RequestMapping (value = "/update/{id}")
//    public String updateCompany(
//            @PathVariable (value = "id") Long id, Model model)  {
//        Company company = companyRepository.getById(id);
//        model.addAttribute(company);
//        return "companyUpdate";
//    }

    @PutMapping("/update/{id}")
    public void updateCompany(@PathVariable Long id, @RequestBody Company company) {
        Company updateCompany = companyRepository.getById(id);
        if (updateCompany != null) {
            updateCompany.setName(company.getName());
            updateCompany.setAddress(company.getAddress());
            updateCompany.setImage(company.getImage());
        }
    }

//    @RequestMapping(value = "/save")
//    public String saveUpdate(
//            @RequestParam(value = "id", required = false) Long id, @Valid Company company, BindingResult result)
//    {
//        if (result.hasErrors()) {
//            if (id == null) {
//                return "companyAdd";
//            } else {
//                return "companyUpdate";
//            }
//        }
//        company.setId(id);
//        companyRepository.save(company);
//        return "redirect:/company/list";
//    }

//    @RequestMapping(value = "/delete/{id}")
//    public String deleteCompany(
//            @PathVariable(value = "id") Long id) {
//        Company company = companyRepository.getById(id);
//        companyRepository.delete(company);
//        return "redirect:/company/list";
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyRepository.deleteById(id);
    }

}
