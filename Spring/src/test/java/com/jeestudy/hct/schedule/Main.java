package com.jeestudy.hct.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ScheduleTaskConfig.class);
	}
}
