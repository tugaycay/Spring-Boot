package com.tugiweb.springcoredemo.config;

import com.tugiweb.springcoredemo.common.Coach;
import com.tugiweb.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swim2Coach() {
        return new SwimCoach();
    }
}
