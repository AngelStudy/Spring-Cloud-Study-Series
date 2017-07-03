package com.jeestudy.hct.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:EventListener.java
 * @Auth:Angel
 * @Date:2017��7��3������3:09:31
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Component
public class EventListener implements ApplicationListener<DefEvent> {

	@Override
	public void onApplicationEvent(DefEvent event) {
		String msg = event.getMsg();

		System.out.println("���������¼���Ϣ��" + msg);

	}

}
