package testApplicationContext;

import com.haut.bean.User;
import com.haut.mapper.UserMapper;
import com.haut.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestAct {
    @Test
    public void test(){
        ApplicationContext atx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sessionFactory = (SqlSessionFactory)atx.getBean("sessionFactory");
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("hushaoheng");
        user.setPassword("adsaf");
        int i = userMapper.insert(user);
       // System.out.println(user.getName());
        System.out.println(user.getId());
        sqlSession.close();
    }
    @Test
    public void testService(){
        ApplicationContext atx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        SqlSessionFactory sessionFactory = (SqlSessionFactory)atx.getBean("sessionFactory");
//        SqlSession sqlSession = sessionFactory.openSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.selectUserById(1);
        UserService userService = (UserService)atx.getBean(UserService.class);
        User user = userService.getUserById(1);
        //System.out.println(user.getName());

//        System.out.println(user.getName());
//        sqlSession.close();
    }
}
