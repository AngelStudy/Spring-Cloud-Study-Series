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

//�� SpringJunit ����
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProfileConfig.class })
@ActiveProfiles("product")
public class SpringJunitTest {
	// ʹ�� package com.jeestudy.hct.profile ���µ�Bean��config

	@Autowired
	private ProfileBean profileBean;

	@Test
	public void productBeanShouldInject() {
		String expected = "Product Bean";
		String actual = profileBean.getContent();

		Assert.assertEquals(expected, actual);

	}
}
