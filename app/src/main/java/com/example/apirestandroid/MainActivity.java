package com.example.apirestandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.apirestandroid.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        OpenWeatherServices service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherServices. class);
        Call<Forecast> call = service.getForcast();
        call.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                Forecast forecast = response.body();
//                binding.tvTemp.setText(String.valueOf(forecast.getMain().getTemp())+"°C");
//                binding.tvTempMax.setText(String.valueOf(forecast.getMain().getTempMax()+"°C"));
//                binding.tvTempMin.setText(String.valueOf(forecast.getMain().getTempMin()+"°C"));
//                binding.tvFeelsLike.setText("Ressentie : " + String.valueOf(forecast.getMain().getFeelsLike()+"°C"));
//                binding.tvDescription.setText(forecast.getWeather().getDescription());
//                binding.tvHumidite.setText(String.valueOf(forecast.getMain().getHumidity())+"%");
            }
            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {  Toast.makeText(MainActivity.this, "Une erreur est survenue !",  Toast.LENGTH_SHORT).show();
            }
        });
    }
}