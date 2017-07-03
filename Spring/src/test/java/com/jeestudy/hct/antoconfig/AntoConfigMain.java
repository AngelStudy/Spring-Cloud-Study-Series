package com.jeestudy.hct.antoconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jeestudy.hct.antoconfig.AntoBeanConfig;
import com.jeestudy.hct.antoconfig.UseFunctionService;

public class AntoConfigMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AntoBeanConfig.class);

		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.sayHello("spring"));
		
		ctx.close();

	}

}
