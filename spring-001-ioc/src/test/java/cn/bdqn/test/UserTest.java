package cn.bdqn.test;

import cn.bdqn.CatServiceImpl;
import cn.bdqn.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testCatService() throws Exception{

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) ac.getBean("user");

        System.out.println(user);
    }


}
