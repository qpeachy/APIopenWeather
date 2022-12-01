package com.example.apirestandroid;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Forecast  implements Serializable {
    //@SerializedName("main")
    Main main;
    //@SerializedName("weather")
    Il weather;
//    @SerializedName("weather")
//    Weather weather;
    @SerializedName("dt")
    private int datetime;
    //@SerializedName("clouds")
    private double cloudiness;

    public Forecast(Main main, Il weather, int datetime, double cloudiness) {
        this.main = main;
        this.weather = weather;
        this.datetime = datetime;
        this.cloudiness = cloudiness;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Il getWeather() {
        return weather;
    }

    public void setWeather(Il weather) {
        this.weather = weather;
    }

    public int getDatetime() {
        return datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }
}
