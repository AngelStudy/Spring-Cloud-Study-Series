package com.jeestudy.hct.antoconfig;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

	public String sayHello(String name) {
		return "Hello," + name;
	}
}
