package com.jeestudy.hct.bean.lifecycle;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @Title:JSR250WayService.java
 * @Auth:Angel
 * @Date:2017��7��3������3:07:03
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class JSR250WayService {

	// �ڹ��캯�� ִ�����֮�� ִ��
	@PostConstruct
	public void init() {
		System.out.println("���캯�� ִ�����֮�� ִ��-JSR250-init-method" + new Date().toLocaleString());
	}

	public JSR250WayService() {
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService" + new Date().toLocaleString());
	}

	// ��Bean����֮ǰִ��
	@PreDestroy
	public void destroy() {
		System.out.println("Bean����֮ǰִ��-JSR250-destroy-method" + new Date().toLocaleString());
	}

}
