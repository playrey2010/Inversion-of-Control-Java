package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    // members
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    // no-arg constructor


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // arg-constructor

    public CricketCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    // Setters
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Setting the value of email address...");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Setting the value of team...");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
