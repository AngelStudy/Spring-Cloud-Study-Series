package com.jeestudy.hct.common.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ElMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);

		ElConfig el = ctx.getBean(ElConfig.class);

		try {
			el.outInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();

	}

}
