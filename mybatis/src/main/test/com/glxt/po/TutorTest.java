package test.com.glxt.po; 

import com.glxt.dao.TutorDAO;
import com.glxt.po.Tutor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.InputStream;

/** 
* Tutor Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 9, 2016</pre> 
* @version 1.0 
*/ 
public class TutorTest {
    private SqlSession session = null;
@Before
public void before() throws Exception {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    session = sqlSessionFactory.openSession();
} 

@After
public void after() throws Exception {
    if (session != null)
    {
        session.close();
    }
} 


/** 
* 
* Method: setCourses(List<Course> courses) 
* 
*/ 
@Test
public void testFindTutorById() throws Exception {
    try {
        TutorDAO tutorDAO = session.getMapper(TutorDAO.class);
        Tutor tutor = tutorDAO.findTutorById(1);
        System.out.println(tutor);
    } finally {
        session.close();
    }
}


} 
