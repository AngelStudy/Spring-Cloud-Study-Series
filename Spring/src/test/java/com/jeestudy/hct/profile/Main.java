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

		// ���� �����ļ�
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.getEnvironment().setActiveProfiles("product");

		// ���� ע��Bean�����࣬����ᱨBeanδ�����
		ctx.register(ProfileConfig.class);

		// ˢ������
		ctx.refresh();

		System.out.println(ctx.getBean(ProfileBean.class).getContent());

		ctx.close();

	}

}
