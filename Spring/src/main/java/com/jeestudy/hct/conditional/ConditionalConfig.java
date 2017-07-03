package com.jeestudy.hct.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @Title:ConditionalConfig.java
 * @Auth:Angel
 * @Date:2017-07-03 15:08:41
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Configuration
public class ConditionalConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public CmdService windowsCmdService() {
		return new WindowsCmdService();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public CmdService linuxCmdService() {
		return new LinuxCmdService();
	}

}
