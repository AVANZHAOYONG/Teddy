package com.css.sword.learn.eventbus;

import com.css.sword.learn.eventbus.event.EtcdChangeEvent;
import com.css.sword.learn.eventbus.eventBus.EtcdEventBusManager;
import com.css.sword.learn.eventbus.eventBus.EventBus;
import com.css.sword.learn.eventbus.subscriber.EtcdSubscriberOne;

/**
 * Hello world!
 *
 * @author zhaoyong
 */
public class App {
    public static void main(String[] args) {
        EventBus eventBus = EtcdEventBusManager.get();
        eventBus.register(new EtcdSubscriberOne());
        EtcdChangeEvent event = new EtcdChangeEvent();
        event.setMessage("This is a message");
        eventBus.post(event);
        System.out.println("Thread-main is over ");
        EtcdEventBusManager.close();
    }
}
