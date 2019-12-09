package cn.bdqn.test;

import cn.bdqn.CatServiceImpl;
import cn.bdqn.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CatServiceTest {

    @Test
    public void testCatService() throws Exception{

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

       // CatServiceImpl catService = (CatServiceImpl) ac.getBean("catService");

        //System.out.println(catService);
        //ac.close();
    }

}
