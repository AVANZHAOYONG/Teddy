package com.css.sword.learn.eventbus.eventBus;

import com.css.sword.learn.eventbus.event.Event;

public interface EventBus {
	
    void register(Object subscriber);

    void unregister(Object subscriber);

    void post(Event event);

}
