package com.jeestudy.hct.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
