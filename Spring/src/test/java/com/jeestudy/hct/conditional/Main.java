package com.jeestudy.hct.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Title:Main.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:13:10
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		CmdService cmdService = ctx.getBean(CmdService.class);
		System.out.println(ctx.getEnvironment().getProperty("os.name") + " 操作系统下的展示列表命令是：" + cmdService.getShowCmd());
		ctx.close();
	}

}
