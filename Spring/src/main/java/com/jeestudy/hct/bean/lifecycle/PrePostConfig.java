package com.jeestudy.hct.bean.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @Title:PrePostConfig.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:07:09
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Configuration
@ComponentScan("com.jeestudy.hct.bean.lifecycle")
public class PrePostConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}

}
