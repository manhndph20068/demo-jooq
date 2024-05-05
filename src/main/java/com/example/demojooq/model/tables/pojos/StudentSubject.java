/*
 * This file is generated by jOOQ.
 */
package com.example.demojooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer studentId;
    private Integer subjectId;
    private Integer status;

    public StudentSubject() {}

    public StudentSubject(StudentSubject value) {
        this.id = value.id;
        this.studentId = value.studentId;
        this.subjectId = value.subjectId;
        this.status = value.status;
    }

    public StudentSubject(
        Integer id,
        Integer studentId,
        Integer subjectId,
        Integer status
    ) {
        this.id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.status = status;
    }

    /**
     * Getter for <code>manage_students.student_subject.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>manage_students.student_subject.id</code>.
     */
    public StudentSubject setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>manage_students.student_subject.student_id</code>.
     */
    public Integer getStudentId() {
        return this.studentId;
    }

    /**
     * Setter for <code>manage_students.student_subject.student_id</code>.
     */
    public StudentSubject setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    /**
     * Getter for <code>manage_students.student_subject.subject_id</code>.
     */
    public Integer getSubjectId() {
        return this.subjectId;
    }

    /**
     * Setter for <code>manage_students.student_subject.subject_id</code>.
     */
    public StudentSubject setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * Getter for <code>manage_students.student_subject.status</code>.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>manage_students.student_subject.status</code>.
     */
    public StudentSubject setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StudentSubject other = (StudentSubject) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.studentId == null) {
            if (other.studentId != null)
                return false;
        }
        else if (!this.studentId.equals(other.studentId))
            return false;
        if (this.subjectId == null) {
            if (other.subjectId != null)
                return false;
        }
        else if (!this.subjectId.equals(other.subjectId))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.studentId == null) ? 0 : this.studentId.hashCode());
        result = prime * result + ((this.subjectId == null) ? 0 : this.subjectId.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentSubject (");

        sb.append(id);
        sb.append(", ").append(studentId);
        sb.append(", ").append(subjectId);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
