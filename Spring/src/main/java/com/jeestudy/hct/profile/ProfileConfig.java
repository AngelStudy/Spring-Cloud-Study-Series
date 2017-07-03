package com.jeestudy.hct.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 
 * @Title:ProfileConfig.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:09:58
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public ProfileBean getDevBean() {
		return new ProfileBean("Dev Bean");
	}

	@Bean
	@Profile("product")
	public ProfileBean getProductBean() {
		return new ProfileBean("Product Bean");
	}

}
