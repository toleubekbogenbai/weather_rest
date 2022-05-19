package com.toleubekbogenbai.spring.weather.weather_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
public class WeatherRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherRestApplication.class, args);
    }

}
