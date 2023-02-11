package com.jean.studentapp.StudentApp.repository;

import com.jean.studentapp.StudentApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
}
