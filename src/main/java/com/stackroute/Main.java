package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie=(Movie)context.getBean("movie1");
//        System.out.println("Application context");
//        System.out.println(movie.toString());
//
//        System.out.println("Bean Factory");
//        Resource res = new FileSystemResource("/home/cgi/IdeaProjects/Xmltask/src/main/Resources/bean.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);
//        Movie movie2=(Movie)factory.getBean("movie");
//        System.out.println(movie2.toString());

        //    Movie beanFMovie =(Movie) beanFactory.getBean("movie1");
//    Movie beanDMovie = (Movie) beanFactory.getBean("movie1");
//        Movie movie1 = (Movie) context.getBean("movie1");
//        Movie movie2 = (Movie) context.getBean("movie2");
        System.out.println(movie.toString());

    }
}