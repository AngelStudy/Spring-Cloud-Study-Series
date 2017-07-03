package com.jeestudy.hct.mutithread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
