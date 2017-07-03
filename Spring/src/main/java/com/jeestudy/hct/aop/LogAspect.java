package com.jeestudy.hct.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.jeestudy.hct.aop.Action)")
	public void annotationPointCut() {

		System.out.println("annotationPointCut has been invoked");
		
	}

	@After("annotationPointCut()")
	public void after(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("after - 注解式拦截：" + action.name());
	}

	@Before("execution(* com.jeestudy.hct.aop.MethodService.*(..))")
	public void before(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("before - 方法规则式拦截：" + method.getName());
	}

}
