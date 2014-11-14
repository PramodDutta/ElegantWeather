package com.witmergers.elegantweather;

import java.util.List;

/**
 * Created by WP8Dev on 15-11-2014.
 */

public class WeatherResponse {

    public int cod;
    public String base;
    public List<Weather> weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Main main;

    public WeatherResponse() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }








}



