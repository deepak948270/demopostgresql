package com.thapak.demopostgresql.services;

import java.util.List;

import com.thapak.demopostgresql.entities.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    
    
}
