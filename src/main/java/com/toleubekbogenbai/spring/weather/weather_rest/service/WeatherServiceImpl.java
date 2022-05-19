package com.toleubekbogenbai.spring.weather.weather_rest.service;

import com.toleubekbogenbai.spring.weather.weather_rest.DAO.WeatherDAO;
import com.toleubekbogenbai.spring.weather.weather_rest.entitry.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService{
    @Autowired
    private WeatherDAO weatherDAO;
    @Override
    @Transactional
    public List<Weather> getAllWeathers() {
        return weatherDAO.getAllWeathers();
    }

    @Override
    @Transactional
    public void saveWeather(Weather weather) {
        weatherDAO.saveWeather(weather);
    }

    @Override
    @Transactional
    public Weather getWeather(int id) {
        return weatherDAO.getWeather(id);
    }

    @Override
    @Transactional
    public void deleteWeather(int id) {
        weatherDAO.deleteWeather(id);

    }
}
