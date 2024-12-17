package com.example.controle.dao.repositories;

import com.example.controle.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(LocalDate dateNaissance);

}
