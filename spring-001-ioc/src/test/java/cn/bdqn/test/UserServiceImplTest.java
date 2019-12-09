package cn.bdqn.test;

import cn.bdqn.UserServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public void testUserService() throws Exception{

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl) ac.getBean("userService");

        System.out.println(userService);


    }

}
