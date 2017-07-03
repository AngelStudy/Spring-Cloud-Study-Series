package com.jeestudy.hct.beanconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:JavaBeanConfigMain.java
 * @Auth:Angel
 * @Date:2017-07-03 15:12:49
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class JavaBeanConfigMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);

		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.sayHello("SpringJavaBean"));

		ctx.close();

	}

}
