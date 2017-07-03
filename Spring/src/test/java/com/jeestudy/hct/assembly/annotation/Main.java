package com.jeestudy.hct.assembly.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:12:31
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AssemblyConfig.class);

		AssemblyService awareService = ctx.getBean(AssemblyService.class);

		awareService.out();

		ctx.close();

	}

}
