package com.jeestudy.hct.beanconfig;

import org.springframework.context.annotation.Bean;

public class JavaBeanConfig {

	@Bean
	public FunctionService functionService() {

		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());

		return useFunctionService;
	}

}
