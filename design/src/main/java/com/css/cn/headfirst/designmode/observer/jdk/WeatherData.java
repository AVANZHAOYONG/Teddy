package com.css.cn.headfirst.designmode.observer.jdk;

import java.util.Observable;

/**
 * 被观察者
 */
public class WeatherData extends Observable {

    private double temperature;

    public void temperatureChanged(){
        setChanged();
        //拉取
        notifyObservers();
        //推送
//        notifyObservers(temperature);
    }

    /**
     * 为拉取做准备
     *
     * @return
     */
    public double getTemperature() {
        return temperature;
    }

    public void setTemperatureChange(double temperature){
        this.temperature = temperature;
        temperatureChanged();
    }
}
