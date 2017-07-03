package com.jeestudy.hct.antoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

	@Autowired
	private FunctionService functionService;

	public String sayHello(String name) {
		return functionService.sayHello(name);
	}

}
