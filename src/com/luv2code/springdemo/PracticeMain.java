package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myHockeyCoach = context.getBean("myHockeyCoach", Coach.class);

        System.out.println(myHockeyCoach.getDailyFortune());

        context.close();
    }
}
