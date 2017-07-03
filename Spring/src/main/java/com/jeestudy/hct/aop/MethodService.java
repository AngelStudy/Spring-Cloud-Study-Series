package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

/**
 * 
 * @Title:MethodService.java
 * @Auth:Angel
 * @Date:2017-07-03 14:58:46
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Service
public class MethodService {
	public void add() {
		System.out.println("MethodService.add()");
	}
}
