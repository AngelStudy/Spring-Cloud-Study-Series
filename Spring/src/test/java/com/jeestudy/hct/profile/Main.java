package com.jeestudy.hct.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017-07-03 15:13:30
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// 设置 配置文件
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.getEnvironment().setActiveProfiles("product");

		// 后置 注册Bean配置类，否则会报Bean未定义错
		ctx.register(ProfileConfig.class);

		// 刷新容器
		ctx.refresh();

		System.out.println(ctx.getBean(ProfileBean.class).getContent());

		ctx.close();

	}

}
