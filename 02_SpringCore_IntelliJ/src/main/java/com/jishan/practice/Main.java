package com.jishan.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MovieFinder movieFinder = applicationContext.getBean(MovieFinder.class);
        MovieLister movieLister = applicationContext.getBean(MovieLister.class);

        movieLister.listMovies(movieFinder.findAllMovies());
    }
}
