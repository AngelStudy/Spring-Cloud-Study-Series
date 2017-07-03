package com.jeestudy.hct.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017��7��3������3:13:10
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		CmdService cmdService = ctx.getBean(CmdService.class);
		System.out.println(ctx.getEnvironment().getProperty("os.name") + " ����ϵͳ�µ�չʾ�б������ǣ�" + cmdService.getShowCmd());
		ctx.close();
	}

}
