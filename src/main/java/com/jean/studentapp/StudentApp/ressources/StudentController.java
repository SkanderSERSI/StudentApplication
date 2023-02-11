package com.jean.studentapp.StudentApp.ressources;

import com.jean.studentapp.StudentApp.dto.StudentDTO;
import com.jean.studentapp.StudentApp.model.Student;
import com.jean.studentapp.StudentApp.services.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
@Slf4j
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity registerStudent(@RequestBody StudentDTO studentDTO) {
        log.info("Registering student {} {} ..... loading ..", studentDTO.getName(), studentDTO.getLastName());
        studentService.registerStudent(studentDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity getStudent(@RequestParam Long id) {
        log.info("Searching student with id {} ..... loading ..", id);
        StudentDTO studentDTO = studentService.searchStudent(id);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

}
