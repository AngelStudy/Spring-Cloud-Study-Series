package com.jeestudy.hct.beanconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanConfigMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);

		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.sayHello("SpringJavaBean"));

		ctx.close();

	}

}
