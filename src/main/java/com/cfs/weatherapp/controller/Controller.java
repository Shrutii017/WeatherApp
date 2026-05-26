package com.cfs.weatherapp.controller;
import com.cfs.weatherapp.dto.WeatherForecast;
import com.cfs.weatherapp.dto.WeatherResponse;
import com.cfs.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class Controller {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city)
    {
        return weatherService.test();
    }
    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city)
    {
        return weatherService.getData(city);
    }
    @GetMapping("/forecast")
    public WeatherForecast getForecast(@RequestParam String city, @RequestParam int days)
    {
        return weatherService.getForecast(city,days);
    }
}