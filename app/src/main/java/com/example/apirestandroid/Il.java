package com.example.apirestandroid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Il {
   // @SerializedName("weather")
    private List<Weather> weatherList;

    public Il(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }
}
