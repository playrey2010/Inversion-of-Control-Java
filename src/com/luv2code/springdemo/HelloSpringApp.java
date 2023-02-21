package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the Spring Config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve a bean from the Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // Call Methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call new methods
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}


