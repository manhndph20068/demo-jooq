package com.example.demojooq.repository.impl;

import com.example.demojooq.model.tables.records.StudentsRecord;
import com.example.demojooq.repository.StudentRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import static com.example.demojooq.model.tables.Students.STUDENTS;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final DSLContext dslContext;

    public StudentRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<StudentsRecord> findAll() {
        return dslContext.selectFrom(STUDENTS)
                .fetchInto(StudentsRecord.class);
    }

    @Override
    public StudentsRecord findById(Integer id) {
        return dslContext.selectFrom(STUDENTS)
                .where(STUDENTS.ID.eq(id))
                .fetchOne();
    }
}
