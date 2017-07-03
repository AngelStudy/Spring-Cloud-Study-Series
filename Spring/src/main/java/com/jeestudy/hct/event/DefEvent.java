package com.jeestudy.hct.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @Title:DefEvent.java
 * @Auth:Angel
 * @Date:2017-07-03 15:09:18
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class DefEvent extends ApplicationEvent {

	private static final long serialVersionUID = 8470281812714058610L;
	private String msg;

	public DefEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
