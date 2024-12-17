package com.example.controle.service;

import com.example.controle.dao.repositories.StudentRepository;
import com.example.controle.dto.StudentDTO;
import com.example.controle.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentManager implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDto) {
        return studentMapper.fromStudentToStudentDto(
                studentRepository.save(studentMapper.fromStudentDtoToStudent(studentDto))
        );
    }

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance) {
        return studentRepository.findByDateNaissance(dateNaissance)
                .stream()
                .map(studentMapper::fromStudentToStudentDto)
                .collect(Collectors.toList());
    }
}
