package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
	@Action(name="ע��ʽ����add()")
	public void add(){
		
		System.out.println("AnnotationService.add()");
		
	}

}
