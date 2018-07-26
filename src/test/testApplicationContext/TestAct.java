package testApplicationContext;

import com.haut.bean.User;
import com.haut.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAct {
    @Test
    public void test(){
        ApplicationContext atx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sessionFactory = (SqlSessionFactory)atx.getBean("sessionFactory");
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(1);
        sqlSession.close();
    }
}
