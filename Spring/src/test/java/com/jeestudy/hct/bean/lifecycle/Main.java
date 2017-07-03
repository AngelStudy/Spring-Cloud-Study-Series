package com.jeestudy.hct.bean.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrePostConfig.class);

		BeanWayService beanWayService = ctx.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = ctx.getBean(JSR250WayService.class);

		ctx.close();

	}

}
