package com.jeestudy.hct.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:LogAspect.java
 * @Auth:Angel
 * @Date:2017��7��3������2:58:04
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:ʹ��ע������AOP �ֱ���� ע�ⷽʽ�ͷ�������ʽ
 */
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
		System.out.println("after - ע��ʽ���أ�" + action.name());
	}

	@Before("execution(* com.jeestudy.hct.aop.MethodService.*(..))")
	public void before(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("before - ��������ʽ���أ�" + method.getName());
	}

}
