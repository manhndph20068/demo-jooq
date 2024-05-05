package com.example.demojooq.service;

import com.example.demojooq.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    StudentDto findById(Integer id);
}
