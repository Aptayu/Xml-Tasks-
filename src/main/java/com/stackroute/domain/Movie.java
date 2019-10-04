 package com.stackroute.domain;

 import org.springframework.beans.BeansException;
 import org.springframework.beans.factory.BeanFactory;
 import org.springframework.beans.factory.BeanFactoryAware;
 import org.springframework.beans.factory.BeanNameAware;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.ApplicationContextAware;

 public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
     private Actor actor;
     ApplicationContext context;
     private BeanFactory beanFactory;
     private String beanName;

     @Override
     public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
     }

     @Override
     public void setBeanName(String s) {
            this.beanName = s;
     }

     @Override
     public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.context = context;
     }




//
//    public Movie(Actor actor) {
//        this.actor = actor;
//    }

//    public Actor getActor() {
//        return actor;
//    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String toString() {
        return "Movie{" +
                "actor=" + actor.toString()+
                "}";
    }



}
