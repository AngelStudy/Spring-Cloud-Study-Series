package com.jeestudy.hct.assembly.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AssemblyConfig.class);

		AssemblyService awareService = ctx.getBean(AssemblyService.class);

		awareService.out();

		ctx.close();

	}

}
