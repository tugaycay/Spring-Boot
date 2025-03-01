package com.tugiweb.springcoredemo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("IN constructor"+getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff():"+getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyStartupStuff():"+getClass().getSimpleName());
        System.out.println("herkes gider biz kalırız biz Galatasarayızzzzz....");
    }


    @Override
    public String getDailyWorkout() {
        return "15 Dakika hızlı bowling çalışın. Hadi kral yaparsın! ooOoo";
    }




}
