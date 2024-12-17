package com.example.controle.service;

import com.example.controle.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDto);
    List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance);
}
