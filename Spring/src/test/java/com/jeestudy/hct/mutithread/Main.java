package com.jeestudy.hct.mutithread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:13:23
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AsyncConfig.class);

		AsyncTaskService asyncTaskService = ctx.getBean(AsyncTaskService.class);

		for (int i = 0; i < 10; i++) {
			asyncTaskService.exeAsycTask(i);
			asyncTaskService.exeAsycTaskPlus(i);
		}

		ctx.close();
	}

}
