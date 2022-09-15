package com.example.demo.student;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentService {
    List<Student> getStudent();
}
