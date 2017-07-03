package com.jeestudy.hct.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:EventPublisher.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:09:37
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Component
public class EventPublisher {

	@Autowired
	ApplicationContext applicationContext;

	public void publish(String msg) {
		applicationContext.publishEvent(new DefEvent(this, msg));
	}

}
