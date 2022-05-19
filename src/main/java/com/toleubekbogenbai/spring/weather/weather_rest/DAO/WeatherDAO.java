package com.toleubekbogenbai.spring.weather.weather_rest.DAO;

import com.toleubekbogenbai.spring.weather.weather_rest.entitry.Weather;

import java.util.List;

public interface WeatherDAO {
    public List<Weather>getAllWeathers();
    public void saveWeather(Weather weather);
    public Weather getWeather(int id);
    public void deleteWeather(int id);
}
