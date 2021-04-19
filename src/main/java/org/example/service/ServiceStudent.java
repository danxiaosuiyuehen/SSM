package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface ServiceStudent {
    int addStudent(Student student);
    List<Student> queryStudent();
}
