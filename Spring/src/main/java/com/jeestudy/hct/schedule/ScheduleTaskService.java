package com.jeestudy.hct.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTaskService {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Scheduled(fixedRate = 2000)
	public void repeatCurrentDateTimeOfFixRate() {
		System.out.println("ÿ��5����ִ��һ�Σ�" + DATE_FORMAT.format(new Date()));
	}

	@Scheduled(cron = "0 09 11 ? * *")
	public void repeatCurrentDateTimeOfCron() {
		System.out.println("ָ��ʱ��ִ�У�" + DATE_FORMAT.format(new Date()));
	}

}
