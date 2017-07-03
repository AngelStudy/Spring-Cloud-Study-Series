package com.jeestudy.hct.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
