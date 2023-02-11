package com.jean.studentapp.StudentApp.model;

import com.jean.studentapp.StudentApp.enums.Sexe;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "sexe", nullable = false )
    private String sexe;

    @Column(name = "age", nullable = false)
    private int age;
}
