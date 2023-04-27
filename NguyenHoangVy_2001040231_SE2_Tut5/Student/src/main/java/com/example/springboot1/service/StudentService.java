package com.example.springboot1.service;

import com.example.springboot1.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void addStudent(Student student);

    void updateStudent(Long id, Student student);

    void deleteStudentById(Long id);

    List<Student> getAllStudent();

    Student getStudentById(Long id);

}
