package com.jeestudy.hct.antoconfig;

import org.springframework.stereotype.Service;

/**
 * 
 * @Title:FunctionService.java
 * @Auth:Angel
 * @Date:2017-07-03 14:54:09
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description: use @Service annotation
 */
@Service
public class FunctionService {

	public String sayHello(String name) {
		return "Hello," + name;
	}
}
