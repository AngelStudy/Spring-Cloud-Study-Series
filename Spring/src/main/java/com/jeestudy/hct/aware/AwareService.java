package com.jeestudy.hct.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	private String beanName;
	private ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void outPutResult() {
		try {

			System.out.println("BeanName:" + beanName);

			Resource resource = resourceLoader.getResource("classpath:aware.txt");
			System.out.println(IOUtils.toString(resource.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
