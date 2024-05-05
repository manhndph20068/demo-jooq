package com.example.demojooq.service.impl;

import com.example.demojooq.dto.StudentDto;
import com.example.demojooq.mapper.StudentMapper;
import com.example.demojooq.model.tables.records.StudentsRecord;
import com.example.demojooq.repository.StudentRepository;
import com.example.demojooq.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public StudentServiceImpl() {
    }

    @Override
    public List<StudentDto> findAll() {
        List<StudentsRecord> studentRecords = studentRepository.findAll();
        return studentMapper.toListStudentDto(studentRecords);
    }

    @Override
    public StudentDto findById(Integer id) {
        StudentsRecord studentRecord = studentRepository.findById(id);
        return studentMapper.toStudentDto(studentRecord);
    }
}
