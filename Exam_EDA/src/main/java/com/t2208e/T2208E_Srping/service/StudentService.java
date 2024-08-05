package com.t2208e.T2208E_Srping.service;

import com.t2208e.T2208E_Srping.dto.StudentDto;
import com.t2208e.T2208E_Srping.entity.Student;
import com.t2208e.T2208E_Srping.mapper.StudentMapper;
import com.t2208e.T2208E_Srping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toList());
    }

    public StudentDto addStudent(StudentDto studentDto) {
        Student student = studentMapper.toEntity(studentDto);
        return studentMapper.toDto(studentRepository.save(student));
    }
}
