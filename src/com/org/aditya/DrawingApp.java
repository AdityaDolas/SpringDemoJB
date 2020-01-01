package com.org.aditya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //Tringle tringle=new Tringle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Triangle tringle = (Triangle) context.getBean("tringle");
        tringle.draw();
    }
}
