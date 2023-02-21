package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

//        Coach theCoach = context.getBean("myCoach", Coach.class);
//        Coach secondCoach = context.getBean("myCoach", Coach.class);

        Coach theCoach = context.getBean("hockeyCoach", Coach.class);
        Coach secondCoach = context.getBean("hockeyCoach", Coach.class);

        // Are these two the same beans?
        // If scope is not defined, default 'Singleton' will always reference the same object and the result is true

        // If scope is set to 'prototype', a new object is created every time a request is made

        boolean result = theCoach.equals(secondCoach);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for secondCoach: " + secondCoach);
        System.out.println(result);

        context.close();
    }
}
