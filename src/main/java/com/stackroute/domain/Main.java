package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
      /*  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie m=(Movie) factory.getBean("movie");
        m.display();*/
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie Bean1 = (Movie) context.getBean("movie1");
        System.out.println(Bean1.getActor());
        Movie Bean2 = (Movie) context.getBean("movie1");
        System.out.println(Bean2.getActor());
        System.out.println(Bean1.equals(Bean2));
    }
}
