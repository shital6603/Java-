package com.SecurityExample.RoleBasedAuthentication.Repository;

import com.SecurityExample.RoleBasedAuthentication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Integer> {

}
