package com.thapak.demopostgresql.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thapak.demopostgresql.entities.Student;
import com.thapak.demopostgresql.repositories.StudentRepository;
import com.thapak.demopostgresql.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
      return studentRepository.findById(id).orElseThrow(()->new RuntimeException("student not found"));
    }

    @Override
    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }
    
}
