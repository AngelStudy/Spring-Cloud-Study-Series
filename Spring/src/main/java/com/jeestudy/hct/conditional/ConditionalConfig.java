package com.jeestudy.hct.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

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
