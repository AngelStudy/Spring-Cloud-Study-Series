package com.jeestudy.hct.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		CmdService cmdService = ctx.getBean(CmdService.class);
		System.out.println(ctx.getEnvironment().getProperty("os.name") + " ����ϵͳ�µ�չʾ�б������ǣ�" + cmdService.getShowCmd());
		ctx.close();
	}

}
