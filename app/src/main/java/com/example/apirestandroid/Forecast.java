package com.example.apirestandroid;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Forecast  implements Serializable {
    //@SerializedName("main")
    Main main;
    @SerializedName("weather")
    ArrayList<Weather> weathers;

    @SerializedName("dt")
    private int datetime;
    //@SerializedName("clouds")
    private double cloudiness;

    public Forecast(Main main, int datetime, double cloudiness) {
        this.main = main;

        this.datetime = datetime;
        this.cloudiness = cloudiness;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
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
