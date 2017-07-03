package com.jeestudy.hct.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:AopMain.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:12:26
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
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
