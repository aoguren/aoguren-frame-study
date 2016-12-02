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

} 
