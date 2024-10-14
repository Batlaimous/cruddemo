package com.beshoycode.cruddemo.dao;

import com.beshoycode.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student getStudent(int Id);

    List<Student> getAllStudents();

    List<Student> getStudentsByLastName(String theLastName);

    void updateStudent(Student theStudent);

    void deleteStudent(int Id);

}
