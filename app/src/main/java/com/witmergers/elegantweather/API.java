package com.witmergers.elegantweather;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by WP8Dev on 15-11-2014.
 */
public interface API {

    @GET("/weather")
    void getWeather(@Query("q") String cityName,
                    Callback<WeatherResponse> callback);
}
