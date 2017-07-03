package com.jeestudy.hct.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 
 * @Title:ScheduleTaskService.java
 * @Auth:Angel
 * @Date:2017-07-03 15:10:08
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Service
public class ScheduleTaskService {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Scheduled(fixedRate = 2000)
	public void repeatCurrentDateTimeOfFixRate() {
		System.out.println("每隔5秒钟执行一次：" + DATE_FORMAT.format(new Date()));
	}

	@Scheduled(cron = "0 09 11 ? * *")
	public void repeatCurrentDateTimeOfCron() {
		System.out.println("指定时间执行：" + DATE_FORMAT.format(new Date()));
	}

}
