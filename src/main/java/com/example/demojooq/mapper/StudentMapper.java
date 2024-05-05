package com.example.demojooq.mapper;

import com.example.demojooq.dto.StudentDto;
import com.example.demojooq.model.tables.records.StudentsRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "createAt", target = "createAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    StudentDto toStudentDto(StudentsRecord studentsRecord);

    default List<StudentDto> toListStudentDto(List<StudentsRecord> studentsRecords) {
        return studentsRecords.stream()
                .map(studentRecord -> toStudentDto(studentRecord))
                .collect(Collectors.toList());
    }

//    @Mapping(source = "fullName", target = "fullName")
//    @Mapping(source = "createAt", target = "createAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
//    @Mapping(source = "updatedAt", target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
//    StudentsRecord toStudentsRecord(StudentDto studentDto);
}
