package com.toleubekbogenbai.spring.weather.weather_rest.service;

import com.toleubekbogenbai.spring.weather.weather_rest.entitry.Weather;

import java.util.List;

public interface WeatherService {
    public List<Weather> getAllWeathers();
    public void saveWeather(Weather weather);
    public Weather getWeather(int id);
    public void deleteWeather(int id);
}
