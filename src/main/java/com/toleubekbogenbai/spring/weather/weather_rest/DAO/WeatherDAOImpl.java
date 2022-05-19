package com.toleubekbogenbai.spring.weather.weather_rest.DAO;

import com.toleubekbogenbai.spring.weather.weather_rest.entitry.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class WeatherDAOImpl implements WeatherDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Weather> getAllWeathers() {
        Query query = entityManager.createQuery("from Weather");
        List<Weather> allWeather = query.getResultList();
        return allWeather;
    }

    @Override
    public void saveWeather(Weather weather) {
        Weather newWeather = entityManager.merge(weather);
        weather.setId(newWeather.getId());
    }

    @Override
    public Weather getWeather(int id) {
        Weather weather = entityManager.find(Weather.class, id);
        return weather;
    }

    @Override
    public void deleteWeather(int id) {
        Query  query = entityManager.createQuery("delete from Weather where id = :weatherId");
        query.setParameter("weatherId", id);
        query.executeUpdate();

    }
}
