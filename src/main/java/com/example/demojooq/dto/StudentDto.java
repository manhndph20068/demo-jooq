package com.example.demojooq.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String fullName;
    private Integer age;
    private Integer gender;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
    private Integer status;

    public StudentDto() {
    }

    public StudentDto(Integer id, String fullName, Integer age, Integer gender, LocalDateTime createAt, LocalDateTime updatedAt, Integer status) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
