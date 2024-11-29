package com.shital.JPA_Project01.service;

import com.shital.JPA_Project01.entity.Student;
import com.shital.JPA_Project01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudentData(){
        List<Student> list=studentRepo.findAll();
        return list;
    }
    public Student getStudentById(Integer id){

         Optional<Student> byId=studentRepo.findById(id);
         Student student=byId.get();
         return student;
    }
}
