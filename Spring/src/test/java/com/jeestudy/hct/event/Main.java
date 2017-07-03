package com.jeestudy.hct.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);

		EventPublisher eventPublisher = ctx.getBean(EventPublisher.class);

		eventPublisher.publish("app event");

		ctx.close();
	}

}
