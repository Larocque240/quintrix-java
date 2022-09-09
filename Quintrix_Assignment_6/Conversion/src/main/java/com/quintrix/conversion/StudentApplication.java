package com.quintrix.conversion;

import com.quintrix.conversion.dao.DAO;
import com.quintrix.conversion.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    private static DAO<Student> dao;

    public StudentApplication(DAO<Student> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);


        System.out.println("\n All Students --------------------------\n");
        List<Student> students = dao.list();
        students.forEach(System.out::println);
    }



}
