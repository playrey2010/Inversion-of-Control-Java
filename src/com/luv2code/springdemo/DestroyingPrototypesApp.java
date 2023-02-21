package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DestroyingPrototypesApp {
    public static void main(String[] args) {
        // Normally, Spring manages the bean's lifecycle.

        // The exception is, however, for prototypes. You need a custom bean processor.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("destroyingPrototypes-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        context.close();

    }
}
