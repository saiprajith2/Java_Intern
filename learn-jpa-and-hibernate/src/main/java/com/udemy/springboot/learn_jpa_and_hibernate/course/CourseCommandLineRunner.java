package com.udemy.springboot.learn_jpa_and_hibernate.course;

import com.udemy.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.udemy.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.udemy.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;
      @Autowired
      private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS Jpa!","Prajith"));
        repository.save(new Course(2,"Learn AZURE Jpa!","Prajith"));
        repository.save(new Course(3,"Learn GCP Jpa!","Sai"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Prajith"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn AZURE Jpa!"));
        System.out.println(repository.findByName("Learn AWS Jpa!"));


    }
}
