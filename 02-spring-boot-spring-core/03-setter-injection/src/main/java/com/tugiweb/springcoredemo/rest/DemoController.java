package com.tugiweb.springcoredemo.rest;

import com.tugiweb.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach){
        this.myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();

    }
    @GetMapping("/dailyworkou")
    public String getDailyWorkou() {
        return myCoach.getDailyWorkou();

    }

}