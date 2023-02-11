package com.jean.studentapp.StudentApp.dto;

import com.jean.studentapp.StudentApp.enums.Sexe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class StudentDTO {

    private String name;
    private String lastName;
    private Sexe sexe;

    private int age;
}
