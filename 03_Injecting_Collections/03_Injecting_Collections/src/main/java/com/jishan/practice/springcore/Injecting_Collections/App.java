package com.jishan.practice.springcore.Injecting_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/jishan/practice/springcore/Injecting_Collections/beans.xml");
    	
    	Employee emp1 = context.getBean(Employee.class);
    	System.out.println(emp1.getName());
    	System.out.println(emp1.getPhones());
    	System.out.println(emp1.getAddresses());
    	System.out.println(emp1.getCourses());
    }
}
