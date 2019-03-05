package com.stackroute.domain;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
        BeanLifeCycleDemoBean beanLifecycleDemoBean = (BeanLifeCycleDemoBean)context.getBean("BeanLifecycle");
        beanLifecycleDemoBean.customInit();
        beanLifecycleDemoBean.customDestroy();
    }
}