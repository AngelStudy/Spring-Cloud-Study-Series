package com.jeestudy.hct.beanconfig;

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
