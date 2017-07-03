package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

/**
 * 
 * @Title:AnnotationService.java
 * @Auth:Angel
 * @Date:2017-07-03 14:57:09
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:使用自定义注解 @Action
 */
@Service
public class AnnotationService {
	@Action(name = "注解式拦截add()")
	public void add() {

		System.out.println("AnnotationService.add()");

	}

}
