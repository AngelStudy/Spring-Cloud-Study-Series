package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

/**
 * 
 * @Title:AnnotationService.java
 * @Auth:Angel
 * @Date:2017��7��3������2:57:09
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:ʹ���Զ���ע�� @Action
 */
@Service
public class AnnotationService {
	@Action(name = "ע��ʽ����add()")
	public void add() {

		System.out.println("AnnotationService.add()");

	}

}
