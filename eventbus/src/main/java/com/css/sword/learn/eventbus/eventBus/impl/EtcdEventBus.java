package com.css.sword.learn.eventbus.eventBus.impl;

import java.util.concurrent.Executor;

import com.css.sword.learn.eventbus.event.Event;
import com.css.sword.learn.eventbus.eventBus.EventBus;

public class EtcdEventBus implements EventBus {
	
	private com.google.common.eventbus.EventBus eventbus ; 

	public EtcdEventBus(String identifier , Executor executor) {
		super();
		this.eventbus = new com.google.common.eventbus.AsyncEventBus(identifier, executor);
	}

	@Override
	public void register(Object subscriber) {
		eventbus.register(subscriber);

	}

	@Override
	public void unregister(Object subscriber) {
		eventbus.unregister(subscriber);

	}

	@Override
	public void post(Event event) {
		eventbus.post(event);

	}

}
