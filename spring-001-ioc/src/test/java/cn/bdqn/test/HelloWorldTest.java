package cn.bdqn.test;

import cn.bdqn.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldTest {

    @Test
    public void testInfo() throws Exception{

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Hello彭依凝");

        helloWorld.info();

    }

    @Test
    public void testInfo_spring() throws Exception{

        // 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
        HelloWorld helloWorld2 = (HelloWorld) ac.getBean("helloWorld");
        HelloWorld helloWorld3 = (HelloWorld) ac.getBean("helloWorld");
        HelloWorld helloWorld4 = (HelloWorld) ac.getBean("helloWorld");

        System.out.println(helloWorld);
        System.out.println(helloWorld2);
        System.out.println(helloWorld3);
        System.out.println(helloWorld4);

        System.out.println(helloWorld == helloWorld2);
        System.out.println(helloWorld == helloWorld3);
        System.out.println(helloWorld == helloWorld4);
    }

    @Test
    public void testInfo_BeanFactory() throws Exception{

        // 容器
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory bf = new XmlBeanFactory(resource);

        //HelloWorld helloWorld = (HelloWorld) bf.getBean("helloWorld");
        //System.out.println(helloWorld);
    }

}
