package com.jeestudy.hct.bean.lifecycle;

import java.util.Date;

public class BeanWayService {

	public void init(){
		System.out.println("@Bean-init-method"+new Date().toLocaleString());
	}

	public BeanWayService() {
		super();
		System.out.println("��ʼ�����캯��-BeanWayService"+new Date().toLocaleString());
	}
	
	public void destroy(){
		System.out.println("@Bean-destroy-method"+new Date().toLocaleString());
	}
	
}
