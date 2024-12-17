package com.example.controle.mapper;

import com.example.controle.dao.entities.Student;
import com.example.controle.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public StudentDTO fromStudentToStudentDto(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student fromStudentDtoToStudent(StudentDTO studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }
}
