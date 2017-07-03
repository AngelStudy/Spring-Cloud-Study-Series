package com.jeestudy.hct.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017-07-03 15:12:38
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfig.class);

		AwareService awareService = ctx.getBean(AwareService.class);

		awareService.outPutResult();

		ctx.close();

	}

}
