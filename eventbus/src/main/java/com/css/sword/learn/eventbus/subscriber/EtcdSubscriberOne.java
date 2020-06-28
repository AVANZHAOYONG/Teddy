package com.css.sword.learn.eventbus.subscriber;

import com.css.sword.learn.eventbus.event.EtcdChangeEvent;
import com.google.common.eventbus.Subscribe;

public class EtcdSubscriberOne {
	
    @Subscribe
    public void recordGlobalTransactionEventForMetrics(EtcdChangeEvent event) {
    	System.out.println(event.getMessage());
    }

}
