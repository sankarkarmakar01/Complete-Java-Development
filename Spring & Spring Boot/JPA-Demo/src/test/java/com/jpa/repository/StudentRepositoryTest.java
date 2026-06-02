package com.jpa.repository;

import com.jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("sankar2@gmail.com")
                .firstName("Sankar")
                .lastName("Karmakar")
                .guardianName("White")
                .guardianEmail("white2@gmail.com")
                .guardianMobile("9876543210")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("StudentList: " + studentList);
    }
}