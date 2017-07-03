package com.jeestudy.hct.assembly.annotation;

import org.springframework.stereotype.Service;

@Service
public class AssemblyService {
	public void out() {
		System.out.println("自定义组合注解");
	}
}
