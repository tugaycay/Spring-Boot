package com.tugiweb.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("IN constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "50dk çalış.";
    }


}
