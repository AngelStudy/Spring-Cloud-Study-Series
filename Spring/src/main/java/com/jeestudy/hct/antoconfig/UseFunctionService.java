package com.jeestudy.hct.antoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @Title:UseFunctionService.java
 * @Auth:Angel
 * @Date:2017-07-03 14:55:13
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:use @Service annotation
 */
@Service
public class UseFunctionService {

	@Autowired
	private FunctionService functionService;

	public String sayHello(String name) {
		return functionService.sayHello(name);
	}

}
