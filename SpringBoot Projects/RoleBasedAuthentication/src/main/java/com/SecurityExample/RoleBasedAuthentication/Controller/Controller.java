package com.SecurityExample.RoleBasedAuthentication.Controller;


import com.SecurityExample.RoleBasedAuthentication.Repository.studentRepository;
import com.SecurityExample.RoleBasedAuthentication.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    studentRepository studentrepo;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        System.out.println("This is controller class !!");
        return studentrepo.findAll();
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student)
    {
        return studentrepo.save(student);
    }

    @PutMapping("/students/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student)
    {
        Student existing=studentrepo.findById(id).get();
        existing.setName(student.getName());
        existing.setMarks(student.getMarks());
        studentrepo.save(existing);
        return existing;
    }

    @DeleteMapping("/students/{id}")
    public Map<String,Boolean> delete(@PathVariable int id)
    {
        Student existing=studentrepo.findById(id).get();
        studentrepo.delete(existing);

        Map<String, Boolean> response=new HashMap<String, Boolean>();
        response.put("Deleted", Boolean.TRUE);

        return response;
    }

}
