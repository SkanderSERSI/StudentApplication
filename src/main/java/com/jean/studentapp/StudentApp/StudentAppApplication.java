package com.jean.studentapp.StudentApp;

import com.jean.studentapp.StudentApp.dto.StudentDTO;
import com.jean.studentapp.StudentApp.enums.Sexe;
import com.jean.studentapp.StudentApp.services.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentService studentService) {
		return args -> {
			studentService.registerStudent(StudentDTO.builder().lastName("john").name("Doe")
					.age(13).sexe(Sexe.Male).build());
			studentService.registerStudent(StudentDTO.builder().lastName("Alfred").name("Hitchcock")
					.age(14).sexe(Sexe.Male).build());
			studentService.registerStudent(StudentDTO.builder().lastName("Clara").name("Luciani")
					.age(15).sexe(Sexe.Female).build());
			studentService.registerStudent(StudentDTO.builder().lastName("Tristan").name("Mcdonald")
					.age(13).sexe(Sexe.Male).build());
			studentService.registerStudent(StudentDTO.builder().lastName("Justin").name("Bridou")
					.age(18).sexe(Sexe.Male).build());
		};
	}

}
