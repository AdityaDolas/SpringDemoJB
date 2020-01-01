package com.org.aditya;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {
        //Tringle tringle=new Tringle();
        BeanFactory factory = new XmlBeanFactory
                (new FileSystemResource("spring.xml"));
        Tringle tringle=(Tringle) factory.getBean("tringle");
        tringle.draw();
    }
}
