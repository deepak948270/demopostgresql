 package com.thapak.demopostgresql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thapak.demopostgresql.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}