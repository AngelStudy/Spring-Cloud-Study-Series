package com.jeestudy.hct.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:13:16
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);

		EventPublisher eventPublisher = ctx.getBean(EventPublisher.class);

		eventPublisher.publish("app event");

		ctx.close();
	}

}
