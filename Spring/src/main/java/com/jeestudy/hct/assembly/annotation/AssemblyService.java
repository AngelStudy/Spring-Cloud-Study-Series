package com.jeestudy.hct.assembly.annotation;

import org.springframework.stereotype.Service;

/**
 * 
 * @Title:AssemblyService.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:02:07
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Service
public class AssemblyService {
	public void out() {
		System.out.println("自定义组合注解");
	}
}
