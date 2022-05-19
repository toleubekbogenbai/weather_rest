package com.toleubekbogenbai.spring.weather.weather_rest.entitry;

import javax.persistence.*;

@Entity
@Table(name="weathers")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "cityname")
    private String cityName;
    @Column(name = "temperature")
    private double temperature;
    @Column(name = "airhumidity")
    private double airHumidity;

    public Weather() {}

    public Weather(int id, String cityName, double temperature, double airHumidity) {
        this.id = id;
        this.cityName = cityName;
        this.temperature = temperature;
        this.airHumidity = airHumidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(double airHumidity) {
        this.airHumidity = airHumidity;
    }
}
