package com.glxt.dao;
import com.glxt.po.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/12/2.
 */
public interface StudentDAO
{
    public Student findStudentById(int id);

    public List<Student> selectStudent(int id);

    public List<Student> findAllStudents();

    public void insertStudent(Student student);
}
