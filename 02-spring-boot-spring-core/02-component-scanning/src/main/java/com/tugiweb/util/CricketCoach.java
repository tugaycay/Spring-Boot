package com.tugiweb.util;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "15 Dakika hızlı bowling çalışın. Hadi kral yaparsın!";
    }

    @Override
    public String getDailyWorkou() {
        return "BASS BAS BASSSSSS";
    }


}
