package com.jean.studentapp.StudentApp.services;

import com.jean.studentapp.StudentApp.dto.StudentDTO;
import com.jean.studentapp.StudentApp.exceptions.StudentNotFoundException;
import com.jean.studentapp.StudentApp.mapper.StudentMapper;
import com.jean.studentapp.StudentApp.model.Student;
import com.jean.studentapp.StudentApp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;
    public void registerStudent(StudentDTO studentDTO){
        Student student = studentMapper.studentDtoToStudent(studentDTO);
        studentRepository.save(student);
        log.info("Registering student {} {} ended.", studentDTO.getName(), studentDTO.getLastName());
    }

    public StudentDTO searchStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(studentMapper::studentToStudentDto)
                .orElseThrow(() -> new StudentNotFoundException("No student found with this id"));
    }
}
