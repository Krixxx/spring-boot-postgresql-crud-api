package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student krix = new Student(
                    "Krix",
                    "krix@mail.ee",
                    LocalDate.of(2000, DECEMBER,5)
            );

            Student john = new Student(
                    "John",
                    "john@mail.ee",
                    LocalDate.of(2004, DECEMBER,5)
            );

            repository.saveAll(
              List.of(krix,john)
            );
        };
    }
}
