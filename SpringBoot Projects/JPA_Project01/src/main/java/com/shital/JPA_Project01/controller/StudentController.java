package com.shital.JPA_Project01.controller;

import com.shital.JPA_Project01.entity.Student;
import com.shital.JPA_Project01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        List<Student> allStudentData=service.getAllStudentData();
        return allStudentData;
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id)
    {
        return service.getStudentById(id);
    }
}
