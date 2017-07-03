package com.jeestudy.hct.bean.lifecycle;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	// 在构造函数 执行完毕之后 执行
	@PostConstruct
	public void init() {
		System.out.println("构造函数 执行完毕之后 执行-JSR250-init-method"+new Date().toLocaleString());
	}

	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService"+new Date().toLocaleString());
	}

	// 在Bean销毁之前执行
	@PreDestroy
	public void destroy() {
		System.out.println("Bean销毁之前执行-JSR250-destroy-method"+new Date().toLocaleString());
	}

}
