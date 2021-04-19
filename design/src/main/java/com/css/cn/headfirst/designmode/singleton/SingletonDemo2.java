package com.css.cn.headfirst.designmode.singleton;

/**
 * 饿汉模式 通过holder创建
 */
public class SingletonDemo2 {

    private SingletonDemo2(){}

    private static class SingletonDemo2Holder{
        private static final SingletonDemo2 singletonDemo2 = new SingletonDemo2();

        private SingletonDemo2Holder(){
        }
    }

    public static SingletonDemo2 getInstance(){
        return SingletonDemo2Holder.singletonDemo2;
    }
}
