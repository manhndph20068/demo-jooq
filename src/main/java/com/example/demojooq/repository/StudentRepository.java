package com.example.demojooq.repository;

import com.example.demojooq.model.tables.records.StudentsRecord;

import java.util.List;

public interface StudentRepository {
    List<StudentsRecord> findAll();
    StudentsRecord findById(Integer id);
//    void save(StudentRecord student);
//    void update(StudentRecord student);
//    void deleteById(Long id);
}
