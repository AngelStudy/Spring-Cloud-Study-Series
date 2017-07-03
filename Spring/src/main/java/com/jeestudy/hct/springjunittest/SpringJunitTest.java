package com.jeestudy.hct.springjunittest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jeestudy.hct.profile.ProfileBean;
import com.jeestudy.hct.profile.ProfileConfig;

//用 SpringJunit 测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProfileConfig.class })
@ActiveProfiles("product")
public class SpringJunitTest {
	// 使用 package com.jeestudy.hct.profile 包下的Bean和config

	@Autowired
	private ProfileBean profileBean;

	@Test
	public void productBeanShouldInject() {
		String expected = "Product Bean";
		String actual = profileBean.getContent();

		Assert.assertEquals(expected, actual);

	}
}
