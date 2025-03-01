package com.tugiweb.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("IN constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "30dk çalış";
    }


}
