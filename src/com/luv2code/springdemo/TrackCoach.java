package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!" + fortuneService.getFortune();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method doCleanup()");
    }

    // add an init method
    // should be void as return values cannot be retrieved
    public void doMyStartupStuff() {
        System.out.println("Inside doMyStartupStuff()");
    }

    public void doCleanup() {
        System.out.println("Inside doCleanup()");
    }


}
