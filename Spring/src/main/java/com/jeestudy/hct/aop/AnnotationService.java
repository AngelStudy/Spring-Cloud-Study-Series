package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
	@Action(name="×¢½âÊ½À¹½Øadd()")
	public void add(){
		
		System.out.println("AnnotationService.add()");
		
	}

}
