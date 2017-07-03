package com.jeestudy.hct.common.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:ElMain.java
 * @Auth:Angel
 * @Date:2017-07-03 15:12:56
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class ElMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);

		ElConfig el = ctx.getBean(ElConfig.class);

		try {
			el.outInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ctx.close();

	}

}
