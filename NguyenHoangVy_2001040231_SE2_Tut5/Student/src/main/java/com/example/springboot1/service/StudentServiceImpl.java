package com.example.springboot1.service;

import com.example.springboot1.model.Student;
import com.example.springboot1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        Student updatingStudent = getStudentById(id);
        if (updatingStudent != null) {
            updatingStudent.setAge(student.getAge());
            updatingStudent.setName(student.getName());
        }
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }
}
