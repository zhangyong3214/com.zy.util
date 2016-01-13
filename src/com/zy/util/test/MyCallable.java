package com.zy.util.test;

import java.util.Date;
import java.util.concurrent.Callable;

class MyCallable implements Callable<Object> {

	private String taskNum;
	public MyCallable(String taskNum) {
		this.taskNum = taskNum;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(">>>" + taskNum + "线程开启");
		Date date1 = new Date();
		Thread.sleep(1000);
		Date date2 = new Date();
		long time = date2.getTime() - date1.getTime();
		System.out.println(">>>" + taskNum + "线程结束");
		return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
	}
}