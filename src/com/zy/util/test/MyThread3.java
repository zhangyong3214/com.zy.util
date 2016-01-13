package com.zy.util.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread3 {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("------程序开始运行------");
		int taskSize = 3;
		//创建线程池
		ExecutorService es = Executors.newFixedThreadPool(taskSize);
		List<Future> list = new ArrayList<Future>();
		for(int i = 0;i<taskSize;i++){
			Callable call = new MyCallable(i+" ");
			Future f = es.submit(call);
			list.add(f);
		}
		
		es.shutdown();
		
		for(Future f : list){
			System.out.println(">>>"+f.get().toString());
		}
	}
}
