package com.luv2code.springdemo;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;


    public HockeyCoach() {

    }

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot pucks for 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
