package com.jean.studentapp.StudentApp.mapper;

import com.jean.studentapp.StudentApp.dto.StudentDTO;
import com.jean.studentapp.StudentApp.enums.Sexe;
import com.jean.studentapp.StudentApp.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student studentDtoToStudent(StudentDTO studentDTO){
        if (studentDTO==null) return null;
        return Student.builder()
                .name(studentDTO.getName())
                .lastname(studentDTO.getLastName())
                .age(studentDTO.getAge())
                .sexe(studentDTO.getSexe().toString())
                .build();
    }

    public StudentDTO studentToStudentDto(Student student){
        if (student==null) return null;
        return StudentDTO.builder()
                .name(student.getName())
                .lastName(student.getLastname())
                .age(student.getAge())
                .sexe(Sexe.valueOf(student.getSexe()))
                .build();
    }
}
