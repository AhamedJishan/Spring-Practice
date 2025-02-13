package com.jishan.practice.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student student1 = (Student) appContext.getBean("student1");
    	System.out.println(student1);
    	
    	Student student2 = (Student) appContext.getBean("student2");
    	System.out.println(student2);
    	
    	Student student3 = (Student) appContext.getBean("student3");
    	System.out.println(student3);
    }
}
