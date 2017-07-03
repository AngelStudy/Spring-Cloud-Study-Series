package com.jeestudy.hct.aop;

import org.springframework.stereotype.Service;

@Service
public class MethodService {
	public void add() {
		System.out.println("MethodService.add()");
	}
}
