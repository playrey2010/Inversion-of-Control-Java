package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(myCricketCoach.getDailyWorkout());
        context.close();
    }
}
