package com.jeestudy.hct.antoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jeestudy.hct.antoconfig.AntoBeanConfig;
import com.jeestudy.hct.antoconfig.UseFunctionService;

/**
 * 
 * @Title:AntoConfigMain.java
 * @Auth:Angel
 * @Date:2017-07-03 15:12:16
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class AntoConfigMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AntoBeanConfig.class);

		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.sayHello("spring"));

		ctx.close();

	}

}
