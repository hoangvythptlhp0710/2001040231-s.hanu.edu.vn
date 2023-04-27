package com.example.springboot1.controller;

import com.example.springboot1.model.Student;
import com.example.springboot1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(Long id, Student student) {
        studentService.updateStudent(id, student);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }


    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }




}
