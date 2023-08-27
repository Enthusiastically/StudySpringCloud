package com.repository;

import com.entityy.Student;

import java.util.Collection;

public interface IStudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
