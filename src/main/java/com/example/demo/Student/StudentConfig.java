package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student cody = new Student(
          "Cody",
          "cmc.email.com",
          LocalDate.of(2000, Month.JANUARY, 5)
      );

      Student john = new Student(
          "John",
          "jcena.email.com",
          LocalDate.of(1990, Month.MARCH, 25)
      );

      repository.saveAll(
          List.of(cody, john)
      );

    };
  }

}
