package com.tugiweb.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("IN constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Tennis çalış..";
    }


}
