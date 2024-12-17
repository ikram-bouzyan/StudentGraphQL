package com.example.controle.web;

import com.example.controle.dao.entities.Student;
import com.example.controle.dto.StudentDTO;
import com.example.controle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class StudentGraphQLController {
    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String date) {
        LocalDate dateNaissance = LocalDate.parse(date);
        return studentService.getStudentsByDateNaissance(dateNaissance);
    }

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }

}
