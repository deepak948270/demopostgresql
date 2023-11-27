 package com.thapak.demopostgresql.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thapak.demopostgresql.entities.Student;
import com.thapak.demopostgresql.services.StudentService;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/student")

@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService; // using @RequiredArgsConstructor

  /*   public StudentController(StudentService studentService) {
        this.studentService = studentService;
    } */

    //create student 
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    //get single student by id 
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    // get all students 
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    

    
}