package com.jeestudy.hct.assembly.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @Title:AssemblyConfig.java
 * @Auth:Angel
 * @Date:2017-07-03 15:01:17
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:自定义组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface AssemblyConfig {
	String[] value() default {};

}
