package com.jeestudy.hct.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);

		AnnotationService service = ctx.getBean(AnnotationService.class);

		service.add();

		MethodService methodService = ctx.getBean(MethodService.class);

		methodService.add();

		ctx.close();
	}

}
