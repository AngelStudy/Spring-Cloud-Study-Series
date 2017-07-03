package com.jeestudy.hct.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @Title:Action.java
 * @Auth:Angel
 * @Date:2017��7��3������2:56:46
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:�Զ���ע��
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
