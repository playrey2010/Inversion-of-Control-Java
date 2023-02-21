package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    // no-arg constructor


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public CricketCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
