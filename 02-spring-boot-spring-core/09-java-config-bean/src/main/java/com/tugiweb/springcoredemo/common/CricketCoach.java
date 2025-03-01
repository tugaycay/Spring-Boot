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






    @Override
    public String getDailyWorkout() {
        return "15 Dakika hızlı bowling çalışın. Hadi kral yaparsın! ooOoo";
    }




}
