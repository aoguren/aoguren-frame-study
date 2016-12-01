package com.glxt.po;

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
        Student blog = session.selectOne("com.glxt.mappers.StudentMapper.findStudentById", 1);
        System.out.println(blog);
    } finally {
        session.close();
    }
}

} 
