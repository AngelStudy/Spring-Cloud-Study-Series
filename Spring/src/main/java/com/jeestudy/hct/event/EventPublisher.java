package com.jeestudy.hct.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

	@Autowired
	ApplicationContext applicationContext;

	public void publish(String msg) {
		applicationContext.publishEvent(new DefEvent(this, msg));
	}

}
