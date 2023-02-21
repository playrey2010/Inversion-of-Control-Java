package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortuneArray = {"Random Fortune 1", "Random Fortune 2", "Random Fortune 3"};
    private Random randomizer = new Random();
    @Override
    public String getFortune() {
        // pick random index
        int randomIndex = randomizer.nextInt(fortuneArray.length);
        // return random element
        return fortuneArray[randomIndex];
    }
}
