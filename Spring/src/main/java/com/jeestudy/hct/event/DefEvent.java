package com.jeestudy.hct.event;

import org.springframework.context.ApplicationEvent;

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
