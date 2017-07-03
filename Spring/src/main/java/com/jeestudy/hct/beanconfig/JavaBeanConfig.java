package com.jeestudy.hct.beanconfig;

import org.springframework.context.annotation.Bean;

/**
 * 
 * @Title:JavaBeanConfig.java
 * @Auth:Angel
 * @Date:2017-07-03 15:07:50
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
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
