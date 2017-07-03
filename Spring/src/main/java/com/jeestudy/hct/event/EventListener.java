package com.jeestudy.hct.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<DefEvent> {

	@Override
	public void onApplicationEvent(DefEvent event) {
		String msg = event.getMsg();

		System.out.println("监听到的事件信息："+msg);

	}

}
