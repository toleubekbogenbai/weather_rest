package com.toleubekbogenbai.spring.weather.weather_rest.controller;

import com.toleubekbogenbai.spring.weather.weather_rest.entitry.Weather;
import com.toleubekbogenbai.spring.weather.weather_rest.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private WeatherService weatherService;


    @GetMapping("/weather")
    @Scheduled(fixedRate = 3000)
    public String showAllWeather(Model model){
        List<Weather>allweather = weatherService.getAllWeathers();
        model.addAttribute("allweather",allweather);
        return "weather";
    }
//    @GetMapping("/weather/{id}")
//    public Weather getWeather(@PathVariable int id){
//        Weather weather = weatherService.getWeather(id);
//        return weather;
//    }
//    @PostMapping("/weather")
//    public Weather addNewWeather(@RequestBody Weather weather){
//        weatherService.saveWeather(weather);
//        return weather;
//    }
//    @PutMapping("/weather")
//    public Weather updateWeather(@RequestBody Weather weather){
//        weatherService.saveWeather(weather);
//        return weather;
//    }
//    @DeleteMapping("/weather/{id}")
//    public String deleteWeather(@PathVariable int id){
//        Weather weather = weatherService.getWeather(id);
//        weatherService.deleteWeather(id);
//        return "City weather with ID = " + id + " was deleted";
//    }
}
