package com.tugayspring.springboot_deneme.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose  "/" that return "Hello World"

    @Value("${coach.name}")
    private String cocachName;
    @Value("${team.name}")
    private String Veriskop;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World! Tugay Baba";
    }

    @GetMapping("/workout")
    public String getDaliyWorkout(){
        return "SUCCESFULL!!!";}

    @GetMapping("/fortune")
    public String getCocachName(){
        return getDaliyWorkout();
    }

}
// spring.io okunacak kaynak..