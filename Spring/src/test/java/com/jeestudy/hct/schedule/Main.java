package com.jeestudy.hct.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017��7��3������3:13:39
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ScheduleTaskConfig.class);
	}
}
