package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware,BeanNameAware {
    private Actor actor;
    private  ApplicationContextAware applicationContextAware=null;
    private BeanFactory beanFactory;

    public Movie()
    {
        super();
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
 public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    void display()
    {

        System.out.println(actor);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory=beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is:"+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContextAware=applicationContextAware;
    }
}
