package com.jeestudy.hct.common.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * 
 * @Title:ElConfig.java
 * @Auth:Angel
 * @Date:2017��7��3������3:08:19
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Configuration
@ComponentScan("com.jeestudy.hct.common.config")
@PropertySource("classpath:DB.properties")
public class ElConfig {

	// 1.��ȡ�����ļ� - �� $ ����
	@Value("${db.user}")
	private String dbuser;

	// 2.��ȡBean���Ե�ֵ - �� # ����
	@Value("#{user.name}")
	private String userName;

	// 3.��ȡϵͳ����
	@Value("#{systemProperties['os.name']}")
	private String osName;

	// 4.��ȡ����ֵ
	@Value("I love you")
	private String nomalStr;

	// 5.��ȡ���ʽ��ֵ
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNum;

	// 6.��ȡ�ļ���ֵ
	@Value("classpath:file.txt")
	private Resource rs;

	// 7.��ȡ��ַ��ֵ
	@Value("http://www.baidu.com")
	private Resource urlRs;

	// 8.��ȡ�����ļ� ע��� DB.properties ����������ȡ
	@Autowired
	private Environment environment;

	public void outInfo() throws Exception {
		System.out.println("1 - " + this.dbuser);
		System.out.println("2 - " + this.userName);
		System.out.println("3 - " + this.osName);
		System.out.println("4 - " + this.nomalStr);
		System.out.println("5 - " + this.randomNum);
		System.out.println("6 - " + IOUtils.toString(rs.getInputStream()));
		System.out.println("7 - " + IOUtils.toString(urlRs.getInputStream(), "UTF-8"));
		System.out.println("8 - " + environment.getProperty("db.pwd"));
	}

}
