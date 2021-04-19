package org.example.service;

import org.example.dao.StudentDao;
import org.example.entity.Student;

import java.util.List;

public class ServiceStudentImpl implements ServiceStudent {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int num=studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students=studentDao.selectStudent();
        return students;
    }
}
