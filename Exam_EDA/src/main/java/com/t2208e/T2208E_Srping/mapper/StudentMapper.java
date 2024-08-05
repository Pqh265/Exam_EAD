package com.t2208e.T2208E_Srping.mapper;

import com.t2208e.T2208E_Srping.dto.StudentDto;
import com.t2208e.T2208E_Srping.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDto toDto(Student student) {
        StudentDto dto = new StudentDto();
        dto.setStudentId(student.getStudentId());
        dto.setStudentCode(student.getStudentCode());
        dto.setFullName(student.getFullName());
        dto.setAddress(student.getAddress());
        return dto;
    }

    public Student toEntity(StudentDto dto) {
        Student student = new Student();
        student.setStudentCode(dto.getStudentCode());
        student.setFullName(dto.getFullName());
        student.setAddress(dto.getAddress());
        return student;
    }
}
