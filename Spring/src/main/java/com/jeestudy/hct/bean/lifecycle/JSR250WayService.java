package com.jeestudy.hct.bean.lifecycle;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	// �ڹ��캯�� ִ�����֮�� ִ��
	@PostConstruct
	public void init() {
		System.out.println("���캯�� ִ�����֮�� ִ��-JSR250-init-method"+new Date().toLocaleString());
	}

	public JSR250WayService() {
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService"+new Date().toLocaleString());
	}

	// ��Bean����֮ǰִ��
	@PreDestroy
	public void destroy() {
		System.out.println("Bean����֮ǰִ��-JSR250-destroy-method"+new Date().toLocaleString());
	}

}
