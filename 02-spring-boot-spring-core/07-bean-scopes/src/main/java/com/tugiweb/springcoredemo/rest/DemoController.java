package com.tugiweb.springcoredemo.rest;

import com.tugiweb.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private  Coach anotherCoach;

    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach,
                               @Qualifier("cricketCoach") Coach theanotherCoach)
    {
        System.out.println("In constructor:"+ getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach= theanotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();

    }
    @GetMapping("/check")
    public String check(){
        return "myCoach == anotherCoach" + (myCoach == anotherCoach);
    }


}