package com.jeestudy.hct.mutithread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 
 * @Title:AsyncTaskService.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:09:48
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
@Service
public class AsyncTaskService {

	@Async
	public void exeAsycTask(int i) {
		System.out.println("执行异步任务：" + i);
	}

	@Async
	public void exeAsycTaskPlus(int i) {
		System.out.println("执行异步任务Plus：" + ++i);
	}

}
