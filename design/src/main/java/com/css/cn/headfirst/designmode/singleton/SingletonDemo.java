package com.css.cn.headfirst.designmode.singleton;

/**
 * 懒汉 double check 机制
 */
public class SingletonDemo {
    private static volatile SingletonDemo singletonDemo;
    private SingletonDemo(){}

    public static SingletonDemo getInstance(){
        if(singletonDemo == null){
            synchronized (SingletonDemo.class){
                if(singletonDemo == null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}
