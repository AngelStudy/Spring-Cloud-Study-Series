package com.jeestudy.hct.bean.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017-07-03 15:12:44
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrePostConfig.class);

		BeanWayService beanWayService = ctx.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = ctx.getBean(JSR250WayService.class);

		ctx.close();

	}

}
