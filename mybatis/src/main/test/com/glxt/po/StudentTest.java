package com.glxt.po;

import com.glxt.dao.StudentDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

/** 
* Student Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 1, 2016</pre> 
* @version 1.0 
*/ 
public class StudentTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void test() throws Exception {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session = sqlSessionFactory.openSession();
    try {
        StudentDAO studentDAO = session.getMapper(StudentDAO.class);
        Student student = studentDAO.findStudentById(1);
        System.out.println(student);
    } finally {
        session.close();
    }

}

    @Test
    public void testTypeHandler() throws Exception
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StudentDAO studentDAO = session.getMapper(StudentDAO.class);
            Student student = new Student(33, "lisi", "liggi@126.com", new Date());
            PhoneNumber phoneNumber = new PhoneNumber("110", "01", "345");
            student.setPhone(phoneNumber);
            studentDAO.insertStudent(student);
            session.commit();   // 注意需要手动提交
        } finally {
            session.close();
        }
    }
    @Test
    public void testInsert() throws Exception
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StudentDAO studentDAO = session.getMapper(StudentDAO.class);
            Student student = new Student(33, "lisi", "liggi@126.com", new Date());
            studentDAO.insertStudent(student);
            session.commit();   // 注意需要手动提交
        } finally {
            session.close();
        }
    }

    @Test
    public void testFindAllStudents() throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StudentDAO studentDAO = session.getMapper(StudentDAO.class);
            List<Student> students = studentDAO.findAllStudents();
            for (Student student : students)
            {
                System.out.println(student);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void testselectStudent() throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StudentDAO studentDAO = session.getMapper(StudentDAO.class);
            List<Student> students = studentDAO.selectStudent(3);
            for (Student student : students)
            {
                System.out.println(student);
            }


        } finally {
            session.close();
        }
    }
}
