package com.jeestudy.hct.mutithread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

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
