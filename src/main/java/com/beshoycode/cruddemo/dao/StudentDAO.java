package com.beshoycode.cruddemo.dao;

import com.beshoycode.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student getStudent(int Id);


}
