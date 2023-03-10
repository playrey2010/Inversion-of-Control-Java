package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(myCricketCoach.getDailyWorkout());

        System.out.println(myCricketCoach.getEmailAddress());
        System.out.println(myCricketCoach.getTeam());
        context.close();
    }
}
