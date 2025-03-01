package com.tugayspring.springboot_deneme.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose  "/" that return "Hello World"

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.lastname}")
    private String lastName;

    @GetMapping("/customer")
    public String customer(){
        return teamName + coachName + lastName ;
    }
    @GetMapping("/info")
    public String sayHello(){
        return "Hoşgeldiniz!!" ;
    }
}
