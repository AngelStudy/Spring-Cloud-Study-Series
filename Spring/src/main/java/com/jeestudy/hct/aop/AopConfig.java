package com.jeestudy.hct.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @Title:AopConfig.java
 * @Auth:Angel
 * @Date:2017年7月3日下午2:57:40
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:启用Aspectj
 */
@Configuration
@ComponentScan("com.jeestudy.hct.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
