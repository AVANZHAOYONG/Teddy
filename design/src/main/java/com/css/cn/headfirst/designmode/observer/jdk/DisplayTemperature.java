package com.css.cn.headfirst.designmode.observer.jdk;


import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class DisplayTemperature implements Observer {
    private Observable observable;
    private double temperature;

    public DisplayTemperature(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
//        //推送方式
//        if(arg instanceof Double){
//            this.temperature = (Double) arg;
//        }
        //拉取方式
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
        }
    }

    public void getTemperature() {
        System.out.println("温度为:" + temperature);
    }
}
