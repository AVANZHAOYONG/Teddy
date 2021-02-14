package com.css.cn.headfirst.designmode.observer.jdk;

public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayTemperature displayTemperature = new DisplayTemperature(weatherData);
        displayTemperature.getTemperature();
        weatherData.setTemperatureChange(100);
        displayTemperature.getTemperature();
    }
}
