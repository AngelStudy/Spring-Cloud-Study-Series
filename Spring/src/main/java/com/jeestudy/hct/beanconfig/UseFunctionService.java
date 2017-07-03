package com.jeestudy.hct.beanconfig;

/**
 * 
 * @Title:UseFunctionService.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:07:56
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class UseFunctionService {

	private FunctionService functionService;

	public String sayHello(String name) {
		return functionService.sayHello(name);
	}

	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

}
