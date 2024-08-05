package com.t2208e.T2208E_Srping.repository;

import com.example.sis.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
