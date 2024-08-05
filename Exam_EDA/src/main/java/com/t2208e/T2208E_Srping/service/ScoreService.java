package com.t2208e.T2208E_Srping.service;

import com.t2208e.T2208E_Srping.dto.ScoreDto;
import com.t2208e.T2208E_Srping.entity.Student;
import com.t2208e.T2208E_Srping.entity.StudentScore;
import com.t2208e.T2208E_Srping.entity.Subject;
import com.t2208e.T2208E_Srping.repository.StudentRepository;
import com.t2208e.T2208E_Srping.repository.StudentScoreRepository;
import com.t2208e.T2208E_Srping.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private StudentScoreRepository studentScoreRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public void addScore(ScoreDto scoreDto) {
        Student student = studentRepository.findById(scoreDto.getStudentId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid student ID"));
        Subject subject = subjectRepository.findById(scoreDto.getSubjectId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid subject ID"));

        StudentScore studentScore = new StudentScore();
        studentScore.setStudent(student);
        studentScore.setSubject(subject);
        studentScore.setScore1(scoreDto.getScore1());
        studentScore.setScore2(scoreDto.getScore2());

        studentScoreRepository.save(studentScore);
    }
}
