package com.jeestudy.hct.mutithread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void exeAsycTask(int i) {
		System.out.println("ִ���첽����" + i);
	}

	@Async
	public void exeAsycTaskPlus(int i) {
		System.out.println("ִ���첽����Plus��" + ++i);
	}

}
